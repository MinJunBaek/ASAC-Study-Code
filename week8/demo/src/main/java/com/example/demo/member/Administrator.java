package com.example.demo.member;

import com.example.demo.dto.MemberCreateRequestDto;
import java.time.LocalDate;
import lombok.AccessLevel;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@ToString(callSuper = true) // 상속받아도 자식 클래스의 필드만 노출 callSuper를 통해 부모 클래스의 필드 노출
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Administrator extends Member {

  String role;
  LocalDate allocatedAt;

  public Administrator(Integer id, String name, int age, String email, String role) {
    super(id, name, age, email);
    this.role = role;
    this.allocatedAt = LocalDate.now();
  }
}
