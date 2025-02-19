package com.example.demo.member;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(onlyExplicitlyIncluded = true, includeFieldNames = false)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode(of = {"id", "name"})
public class Member {

  @ToString.Include(name = "memberId")
  private Integer id;     // Reference Type 주소를 담는 그릇 : 객체가 담기며, NULL 이 들어갈 수 있다.
  @ToString.Include(rank = -1) // 출력순위로 0보다 낮을수록 더 후순위
  private String name;
  private int age;        // Primitive Type 값을 담는 그릇 : 값 그 자체가 담기며, NULL 이 들어갈 수 없다. (무조건 값이 있어야하기에 기본값 존재)
  private String email;

//  public boolean equals(Member member) {
//    return this.hashCode() == member.hashCode();
//  }
//
//  public int hashCode() {
//    int hash = 7;
//    hash = 31 * hash + (id == null ? 0 : id.hashCode());
//    hash = 31 * hash + (name == null ? 0 : name.hashCode());
//    hash = 31 * hash + (int) age;
//    hash = 31 * hash + (email == null ? 0 : email.hashCode());
//    return hash;
//  }
}
