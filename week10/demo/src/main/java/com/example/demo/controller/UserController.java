package com.example.demo.controller;

import com.example.demo.controller.dto.UserCreateRequestDto;
import com.example.demo.controller.dto.UserResponseDto;
import com.example.demo.service.IRepository;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import java.util.List;
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
    UserResponseDto user = userService.findById(id);
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(user);
  }

  @PostMapping("") // @RequestMapping(method = RequestMethod.POST)와 같다 -> 사용자 데이터를 JSON으로 받아 새로운 사용자를 생성하는 역할
  @ResponseBody  // 메서드 반환값을 HTTP 응답 본문(body)에 직접 포함됨. 즉, UserResponseDto 객체가 JSON 형식으로 변환되어 클라이언트에게 응답
  public ResponseEntity<UserResponseDto> Save(
      @RequestBody @Valid UserCreateRequestDto request) { // @RequestBody는 HTTP 요청의 본문에서 데이터를 읽어와 JAVA객체로 변환
    // 클라이언트가 JSON형식으로 데이터를 보낼 경우 UserCreateRequestDto가 자동으로 매핑
    UserResponseDto user = userService.save(request.getName(), request.getAge(), request.getJob(),
        request.getSpecialty());
    return ResponseEntity
//      .status(HttpStatusCode.valueOf(201))
        .status(HttpStatus.CREATED) // 1. HTTP Status Code
        .body(user); // 2. 결과 객체(User)
  }
}