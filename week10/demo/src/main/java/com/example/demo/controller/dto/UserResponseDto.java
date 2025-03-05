package com.example.demo.controller.dto;

import com.example.demo.service.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@JsonPropertyOrder({"userName", "userId"}) // 프로퍼티(필드) 노출 순서 결정(대소문자 구별을 확실히 해야함)
@Getter
@JsonInclude(Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class UserResponseDto { // UserResponseDto 사용하는 이유 : 데이터 유출 방지, 필요한 데이터 전송, API 응답 형식을 명확하게 정의가능

  @JsonProperty("userId")
  Integer id;
  @JsonProperty("userName")
  String name;
  @JsonIgnore // JSON 반환시 특정 프로퍼티 제외
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
