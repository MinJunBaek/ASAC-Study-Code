package com.example.demo.domain.users.controller;

import com.example.demo.domain.users.controller.dto.UserResponseDto;
import com.example.demo.domain.users.controller.dto.UserUpsertRequestDto;
import com.example.demo.domain.users.repository.entity.User;
import com.example.demo.domain.users.service.UserService;
import jakarta.validation.Valid;
import java.util.List;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/api/users")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserController {

  UserService userService;

  @ResponseBody
  @RequestMapping(value = "", method = RequestMethod.GET)
  public ResponseEntity<List<UserResponseDto>> readAll() {
    log.info(userService.getClass().toString());
    List<UserResponseDto> userResponseDtoList = userService.findAll();
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(userResponseDtoList);
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public ResponseEntity<UserResponseDto> read(@PathVariable Integer id) {
    log.info(userService.getClass().toString());
    UserResponseDto userResponseDto = userService.findById(id);
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(userResponseDto);
  }

  @ResponseBody
  @RequestMapping(value = "", method = RequestMethod.POST)
  public ResponseEntity<UserResponseDto> save(@RequestBody @Valid UserUpsertRequestDto request) {
    log.info(userService.getClass().toString());
    UserResponseDto createdUser = userService.save(request);
    return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(createdUser);
  }
}
