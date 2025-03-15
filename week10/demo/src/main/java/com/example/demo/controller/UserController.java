package com.example.demo.controller;

import com.example.demo.controller.dto.UserCreateRequestDto;
import com.example.demo.controller.dto.UserResponseDto;
import com.example.demo.controller.dto.common.BaseResponse;
import com.example.demo.exception.CustomException;
import com.example.demo.exception.ExceptionType;
import com.example.demo.service.IRepository;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
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
  public BaseResponse<UserResponseDto> detailData(@RequestParam("id") Integer id) {
    try {
      UserResponseDto user = userService.findById(id);
      return BaseResponse.success(user);
    } catch (CustomException e) {
      log.warn(e.getMessage(), e);
      return BaseResponse.failure(e.getType());
    } catch (Exception e) {
      log.error(e.getMessage(), e);
      return BaseResponse.failure(ExceptionType.UNCLASSIFIED_ERROR);
    }
  }

  @PostMapping("")
  @ResponseBody
  public BaseResponse<UserResponseDto> Save(@RequestBody @Valid UserCreateRequestDto request) {
    try {
      UserResponseDto user = userService.save(request.getName(), request.getAge(), request.getJob(),
          request.getSpecialty());
      return BaseResponse.success(user);
    } catch (CustomException e) {
      log.warn(e.getMessage(), e);
      return BaseResponse.failure(e.getType());
    } catch (Exception e) {
      log.error(e.getMessage(), e);
      return BaseResponse.failure(ExceptionType.UNCLASSIFIED_ERROR);
    }
  }
}