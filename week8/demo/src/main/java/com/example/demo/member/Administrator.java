package com.example.demo.member;

import java.time.LocalDate;

public class Administrator extends Member {

  private String role;
  private LocalDate allocatedAt;

  public Administrator(Integer id, String name, int age, String email, String role) {
    super(id, name, age, email);
    this.role = role;
    this.allocatedAt = LocalDate.now();
  }

  public String toString() {
    return String.format(
        "Administrator(id=%s, name=%s, age=%s, email=%s, role=%s, allocated=%s)",
        this.getId(), this.getName(), this.getAge(), this.getEmail(), this.role, this.allocatedAt
    );
  }
}
