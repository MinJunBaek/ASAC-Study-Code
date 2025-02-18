package com.example.demo.member;

public class Member {

  protected Integer id;     // Reference Type 주소를 담는 그릇 : 객체가 담기며, NULL 이 들어갈 수 있다.
  protected String name;
  protected int age;        // Primitive Type 값을 담는 그릇 : 값 그 자체가 담기며, NULL 이 들어갈 수 없다. (무조건 값이 있어야하기에 기본값 존재)
  protected String email;

  public Member(MemberRequestDto dto) {
//  this.id = null; // Reference Type 이기 때문에 값을 설정하지 않으면 NULL 이 들어간다.
    this.name = dto.getName();
//  this.age = 0;   // Primitive Type 이기 때문에 값을 설정하지 않으면 기본값 0 이 들어간다.
    this.email = dto.getEmail();
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String toString() {
    return String.format("Member[id=%d, name=%s, email=%s]", id, name, email);
  }

  public String getName() {
    return this.name;
  }
}
