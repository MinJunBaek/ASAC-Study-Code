package com.example.demo.controller.dto;

import com.example.demo.service.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@JsonInclude(Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class UserResponseDto { // UserResponseDto 사용하는 이유 : 데이터 유출 방지, 필요한 데이터 전송, API 응답 형식을 명확하게 정의가능

  // 응답 받은 객체의 필드명이 변환된다.
  @JsonProperty("UserId")
  Integer id;
  @JsonProperty("username")
  String name;
  Integer age;
  String job;
  String specialty;
  String address;
  String postcode;

  public static UserResponseDto from(User entity) {
    return new UserResponseDto(
        entity.getId(),
        entity.getName(),
        entity.getAge(),
        entity.getJob(),
        entity.getSpecialty(),
        null,
        null
    );
  }
}
