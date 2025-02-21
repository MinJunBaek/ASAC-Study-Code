package com.example.demo;

import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    Member member = new Member(1, "Aaron", 10, "aaron@example.com");

    System.out.println("---");
    System.out.println(member);              // 객체 주소 (aaron 주소값 == baron 주소값)
    System.out.println(member.toString());   // 객체
    System.out.println(member.MEMBER_TO_STRING_FORMAT);
    System.out.println(Member.MEMBER_TO_STRING_FORMAT);
  }
}
