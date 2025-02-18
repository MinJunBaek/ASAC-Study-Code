package com.example.demo;

import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    Member aaron = new Member(1, "Aaron", 10, "aaron@example.com");

    System.out.println("---");
    System.out.println(aaron);              // 객체
    System.out.println(aaron.toString());   // 객체

    // aaron.setId();                       // @Setter 필드 단위로 설정되어있지 않아 필드 수정 불가능
    // aaron.setName();                     // @Setter 필드 단위로 설정되어있지 않아 필드 수정 불가능
    aaron.setAge(20);                       // @Setter (필드 단위)
    aaron.setEmail("aaron@different.com");  // @Setter (필드 단위)

    System.out.println(aaron.getId());      // @Getter 클래스 단위로 적용하여 모든 필드 조회 가능
    System.out.println(aaron.getName());    // @Getter (클래스 단위)
    System.out.println(aaron.getAge());     // @Getter (클래스 단위)
    System.out.println(aaron.getEmail());   // @Getter (클래스 단위)
  }
}
