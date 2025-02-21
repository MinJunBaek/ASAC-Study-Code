package com.example.demo.member;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Member {

  public static String MEMBER_TO_STRING_FORMAT = "Member(id=%s, name=%s, age=%s, email=%s)";

  private Integer id;
  private String name;
  private int age;
  private String email;

  public String toString() {
    return String.format(MEMBER_TO_STRING_FORMAT, this.id, this.name, this.age, this.email);
  }
}
