package com.example.demo.controller;

import com.example.demo.controller.dto.UserRequestDto;
import com.example.demo.controller.dto.UserResponseDto;
import com.example.demo.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @ResponseBody
  @RequestMapping(value = "", method = RequestMethod.GET)
  public ResponseEntity<List<UserResponseDto>> retrieveAll() {
    List<UserResponseDto> users = userService.findAll();
    return ResponseEntity.ok(users);
  }

  @ResponseBody
  @RequestMapping(value = "", method = RequestMethod.POST)
  public ResponseEntity<UserResponseDto> create(@RequestBody UserRequestDto request) {
    UserResponseDto createdUser = userService.insert(request);
    return ResponseEntity.ok(createdUser);
  }

}
