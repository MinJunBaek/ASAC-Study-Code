package com.example.demo.member;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString(onlyExplicitlyIncluded = true, includeFieldNames = false)
@Getter
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Member {

  @ToString.Include(name = "memberId")
  private final Integer id;     // Reference Type 주소를 담는 그릇 : 객체가 담기며, NULL 이 들어갈 수 있다.
  @ToString.Include(rank = -1) // 출력순위로 0보다 낮을수록 더 후순위
  private final String name;
  @Setter(AccessLevel.PRIVATE)
  private int age;        // Primitive Type 값을 담는 그릇 : 값 그 자체가 담기며, NULL 이 들어갈 수 없다. (무조건 값이 있어야하기에 기본값 존재)
  @Setter
  private String email;

}
