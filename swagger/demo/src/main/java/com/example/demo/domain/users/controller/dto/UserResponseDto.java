package com.example.demo.domain.users.controller.dto;

import com.example.demo.domain.users.repository.entity.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class UserResponseDto {
  Integer id;
  String email;
  String name;

  public static UserResponseDto from(User entity) {
    return new UserResponseDto(
        entity.getUserId(),
        entity.getUserEmail(),
        entity.getUserName()
    );
  }
}