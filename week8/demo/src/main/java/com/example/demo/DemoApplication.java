package com.example.demo;

import com.example.demo.member.Administrator;
import com.example.demo.member.Member;
import com.example.demo.member.MemberRequestDto;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    Member aaron = new Member(1, "Aaron", 10, "aaron@example.com");

    System.out.println("---");
    System.out.println(aaron);              // 객체
    System.out.println(aaron.toString());   // 객체
    System.out.println(aaron.getName());    // 필드 중 name
//      System.out.println(aaron.name);         // 필드 중 name (접근제어자 private)
  }
}
