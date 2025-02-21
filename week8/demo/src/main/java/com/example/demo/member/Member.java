package com.example.demo.member;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Member {

  public static String MEMBER_TO_STRING_FORMAT = "Member(id=%s, name=%s, age=%s, email=%s)";

  private Integer id;
  private String name;
  private int age;
  private String email;

  public String toString() {
    return String.format(MEMBER_TO_STRING_FORMAT, this.id, this.name, this.age, this.email);
  }

  public static String toString(Member member) {
    return String.format(MEMBER_TO_STRING_FORMAT, member.id, member.name, member.age, member.email);
  }

  @AllArgsConstructor
  public class Favorite {

    private List<String> favorites;
  }
}
