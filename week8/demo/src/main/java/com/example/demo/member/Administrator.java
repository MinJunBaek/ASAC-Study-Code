package com.example.demo.member;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

// @AllArgsConstructor
@ToString(callSuper = true) // 상속받아도 자식 클래스의 필드만 노출 callSuper를 통해 부모 클래스의 필드 노출
@EqualsAndHashCode(callSuper = true) // Equals 상속
public class Administrator extends Member {

  private String role;
  private LocalDate allocatedAt;

  public Administrator(Integer id, String name, int age, String email, String role) {
    super(id, name, age, email);
    this.role = role;
    this.allocatedAt = LocalDate.now();
  }
}
