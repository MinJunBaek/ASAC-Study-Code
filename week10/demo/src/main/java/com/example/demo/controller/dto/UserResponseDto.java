package com.example.demo.controller.dto;

import com.example.demo.repository.entity.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class UserResponseDto {

  private final Integer id;
  private final String name;

  public static UserResponseDto of(User entity) {
    return new UserResponseDto(
        entity.getId(),
        entity.getName()
    );
  }
}
