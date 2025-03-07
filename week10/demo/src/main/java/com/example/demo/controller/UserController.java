package com.example.demo.controller;

import com.example.demo.controller.dto.UserCreateRequestDto;
import com.example.demo.controller.dto.UserResponseDto;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.service.IRepository;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserController {

  UserService userService;

  @Autowired
  private ApplicationContext applicationContext;

  @GetMapping("/bean")
  @ResponseBody
  public String bean() {
    return applicationContext.getBean(IRepository.class).toString();
  }

  @GetMapping(value = "")
  public String userPage(Model model) {
    List<UserResponseDto> users = userService.findAll();
    model.addAttribute("users", users);
    return "/users/list";
  }

  @GetMapping(value = "/detail")
  public String detailPage(@RequestParam("id") Integer id, Model model) {
    UserResponseDto user = userService.findById(id);
    model.addAttribute("id", user.getId());
    model.addAttribute("name", user.getName());
    model.addAttribute("age", user.getAge());
    model.addAttribute("job", user.getJob());
    model.addAttribute("specialty", user.getSpecialty());
    return "/users/detail";
  }

  @GetMapping("/data")
  @ResponseBody
  public ResponseEntity<UserResponseDto> detailData(@RequestParam("id") Integer id) {
    try {
      UserResponseDto user = userService.findById(id);
      return ResponseEntity
          .status(HttpStatus.OK) // HTTP Status Code : 200
          .body(user);
    } catch (NoSuchElementException | UserNotFoundException e) {
      return ResponseEntity
          .status(HttpStatus.NOT_FOUND) // HTTP Status Code : 404
          .body(null);
    } catch (IllegalArgumentException e) {
      return ResponseEntity
          .status(HttpStatus.BAD_REQUEST) // HTTP Status Code : 400
          .body(null);
    } catch (Exception e) {
      return ResponseEntity
          .status(HttpStatus.INTERNAL_SERVER_ERROR)
          .body(null);
    }
  }

  @PostMapping("")
  @ResponseBody
  public ResponseEntity<UserResponseDto> Save(@RequestBody @Valid UserCreateRequestDto request) {
    try {
      UserResponseDto user = userService.save(request.getName(), request.getAge(), request.getJob(),
          request.getSpecialty());
      return ResponseEntity
//      .status(HttpStatusCode.valueOf(201))
          .status(HttpStatus.CREATED) // 1. HTTP Status Code : 201
          .body(user); // 2. 결과 객체(User)
    } catch (NoSuchElementException | UserNotFoundException e) {
      return ResponseEntity
          .status(HttpStatus.NOT_FOUND) // 1. HTTP Status Code : 404
          .body(null); // 2. 결과 객체(User)
    } catch (IllegalArgumentException e) {
      return ResponseEntity
          .status(HttpStatus.BAD_REQUEST) // 1. HTTP Status Code : 400
          .body(null); // 2. 결과 객체(User)
    } catch (Exception e) {
      return ResponseEntity
          .status(HttpStatus.INTERNAL_SERVER_ERROR) // 1. HTTP Status Code : 500
          .body(null); // 2. 결과 객체(User)
    }
  }
}