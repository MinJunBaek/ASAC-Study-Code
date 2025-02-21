package com.example.demo.member;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@ToString
@Setter(AccessLevel.PUBLIC)
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class Member {

  final Integer id;
  final String name;
  int age;
  String email;

}
