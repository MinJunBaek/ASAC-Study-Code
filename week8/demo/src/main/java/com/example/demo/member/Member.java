package com.example.demo.member;

import com.example.demo.dto.MemberCreateRequestDto;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@ToString
@FieldDefaults(level = AccessLevel.PROTECTED)
@Getter
public class Member {

  Integer id;     // Reference Type 주소를 담는 그릇 : 객체가 담기며, NULL 이 들어갈 수 있다.
  String name = "Unnamed";
  int age;        // Primitive Type 값을 담는 그릇 : 값 그 자체가 담기며, NULL 이 들어갈 수 없다. (무조건 값이 있어야하기에 기본값 존재)
  String email = "Undefined";

  private Member(Integer id, String name, int age, String eamil) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.email = eamil;
  }

  public static Member from(MemberCreateRequestDto requestDto) {
    return new Member(
        null,
        requestDto.getName(),
        0,
        requestDto.getEmail()
    );
  }
}
