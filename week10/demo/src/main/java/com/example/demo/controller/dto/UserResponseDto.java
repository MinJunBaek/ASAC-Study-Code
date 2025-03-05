package com.example.demo.controller.dto;

import com.example.demo.service.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class UserResponseDto { // UserResponseDto 사용하는 이유 : 데이터 유출 방지, 필요한 데이터 전송, API 응답 형식을 명확하게 정의가능

  Integer id;
  String name;
  Integer age;
  String job;
  String specialty;
  @JsonInclude(Include.NON_NULL) // 필드 값이 Null 이면 Json 응답에서 제외하는 역할
  String address;
  @JsonInclude(Include.NON_NULL) // @JsonInclude(JsonInclude.Include.NON_NULL)과 같다.
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
