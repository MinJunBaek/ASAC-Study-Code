package com.example.demo.service;


import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class User {

  @Setter
  Integer id;
  String name;
  Integer age;
  String job;
  String specialty;
  LocalDateTime createdAt;

}
