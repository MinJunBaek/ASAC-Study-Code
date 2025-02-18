package com.example.demo.member;

import java.time.LocalDate;

public class Administrator extends Member {

  private String role;
  private LocalDate allocatedAt;

  public Administrator(String name, String email, String role) {
    super(name, email);
    this.role = role;
    this.allocatedAt = LocalDate.now();
  }

  public String toString() {
    return String.format(
        "Member(id=%s, name=%s, age=%s, email=%s, role=%s, allocated=%s)",
        this.id, this.name, this.age, this.email, this.role, this.allocatedAt
    );
  }

  public String getRole() {
    return role;
  }
}
