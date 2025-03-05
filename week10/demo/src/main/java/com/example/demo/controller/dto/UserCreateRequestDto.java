package com.example.demo.controller.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class UserCreateRequestDto {

  @NotBlank // Null, "" 혹은 " "를 허용하지 않음
  String name;
  @Min((10)) // 최소 10 이상이어야 함
  Integer age;
  @NotNull // Null만 허용하지 않음 "" 혹은 " "은 허용함.
  String job;
  String specialty = "(empty)";
}