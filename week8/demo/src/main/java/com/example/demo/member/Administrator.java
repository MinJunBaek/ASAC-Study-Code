package com.example.demo.member;

import java.time.LocalDate;
import java.util.Collections;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

// @AllArgsConstructor
@ToString(callSuper = true) // 상속받아도 자식 클래스의 필드만 노출 callSuper를 통해 부모 클래스의 필드 노출
@EqualsAndHashCode(callSuper = true) // Equals 상속
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Administrator extends Member {

  String role;
  LocalDate allocatedAt;

  public Administrator(Integer id, String name, int age, String email, String role) {
    super(id, name, age, email, Collections.emptyList());
    this.role = role;
    this.allocatedAt = LocalDate.now();
  }
}
