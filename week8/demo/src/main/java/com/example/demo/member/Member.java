package com.example.demo.member;

import com.example.demo.dto.MemberCreateRequestDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@ToString
@Getter
@FieldDefaults(level = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Member {

  Integer id;     // Reference Type 주소를 담는 그릇 : 객체가 담기며, NULL 이 들어갈 수 있다.
  String name = "Unnamed";
  int age;        // Primitive Type 값을 담는 그릇 : 값 그 자체가 담기며, NULL 이 들어갈 수 없다. (무조건 값이 있어야하기에 기본값 존재)
  String email = "Undefined";

  public static Member from(MemberCreateRequestDto requestDto) {
    return new Member(
        null,
        requestDto.getName(),
        0,
        requestDto.getEmail()
    );
  }
}
