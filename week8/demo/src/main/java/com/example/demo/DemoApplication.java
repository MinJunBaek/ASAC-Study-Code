package com.example.demo;

import com.example.demo.member.Administrator;
import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    String request = "AARON";

    // (1) 빌더 정의
    // (2) 필드 설정 : (2.1) 공통 부분을 먼저 설정하고
    Member.MemberBuilder builder = Member.builder()
        .age(10)
        .email("common@example.com");

    // (2) 필드 설정 : (2.2) 다른 부분은 따로 설정한다 (조건부)
    if (request.equals("AARON")) {
      builder
          .id(1)
          .name("Aaron");
    } else if (request.equals("BARON")) {
      builder
          .id(2)
          .name("Baron");
    }

    //(3) 객체 생성
    Member aaron = builder.build();

    System.out.println("---");
    System.out.println(aaron);              // 객체
    System.out.println(aaron.toString());   // 객체
    System.out.println(aaron.getName());    // 필드 중 name
//  System.out.println(aaron.name);         // 필드 중 name (접근제어자 private)
  }
}
