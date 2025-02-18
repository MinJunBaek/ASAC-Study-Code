package com.example.demo.member;

public class Member {

  Integer id;     // Reference Type 주소를 담는 그릇 : 객체가 담기며, NULL 이 들어갈 수 있다.
  String name;
  int age;        // Primitive Type 값을 담는 그릇 : 값 그 자체가 담기며, NULL 이 들어갈 수 없다. (무조건 값이 있어야하기에 기본값 존재)
  String email;

  public Member(String name, String email) {
    // this.id = null; // Reference Type 이기 때문에 값을 설정하지 않으면 NULL 이 들어간다.
    this.name = name;
    // this.age = 0;   // Primitive Type 이기 때문에 값을 설정하지 않으면 기본값 0 이 들어간다.
    this.email = email;
  }

  public String getName() {
    return this.name;
  }
}
