package com.example.demo.member;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Member {

  Integer id;
  String name;
  int age;
  String email;

  public final String toString() {
    return String.format("Member(id=%s, name=%s, age=%s, email=%s)", this.id, this.name, this.age, this.email);
  }
}
