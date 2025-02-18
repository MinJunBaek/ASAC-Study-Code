package com.example.demo.member;

public class Member {

  protected Integer id;     // Reference Type 주소를 담는 그릇 : 객체가 담기며, NULL 이 들어갈 수 있다.
  protected String name;
  protected int age;        // Primitive Type 값을 담는 그릇 : 값 그 자체가 담기며, NULL 이 들어갈 수 없다. (무조건 값이 있어야하기에 기본값 존재)
  protected String email;

  public Member(Integer id, String name, int age, String email) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.email = email;
  }

  public String toString() {
    return String.format("Member[id=%d, name=%s, email=%s]", id, name, email);
  }

  public String getName() {
    return this.name;
  }
}
