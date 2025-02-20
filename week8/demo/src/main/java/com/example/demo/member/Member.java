package com.example.demo.member;

import java.util.Objects;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Member {

  private static Member instance;

  Integer id;     // Reference Type 주소를 담는 그릇 : 객체가 담기며, NULL 이 들어갈 수 있다.
  String name = "Unnamed";
  int age;        // Primitive Type 값을 담는 그릇 : 값 그 자체가 담기며, NULL 이 들어갈 수 없다. (무조건 값이 있어야하기에 기본값 존재)
  String email = "Undefined";

  public synchronized static Member getInstance() {
    // 체킹을 하게될시 블락을 해서 중복체킹을 방지
    if (Objects.isNull(instance)) {
      instance = new Member();
    }
    return instance;
  }
}
