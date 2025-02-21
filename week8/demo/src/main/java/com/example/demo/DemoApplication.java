package com.example.demo;

import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    Member aaron = new Member(1, "Aaron");

    System.out.println("---");
    System.out.println(aaron);              // 객체 주소 (aaron 주소값 == baron 주소값)
    System.out.println(aaron.toString());   // 객체
//      aaron.setId(2);                         // final 변수는 초기화(Initialized) 이후 변경될 수 없다.
//      aaron.setName("Baron");                 // final 변수는 초기화(Initialized) 이후 변경될 수 없다.
    aaron.setAge(10);                       // Non-final 변수는 언제든 Setter 호출이 가능하다.
    aaron.setEmail("aaron@example.com");    // Non-final 변수는 언제든 Setter 호출이 가능하다.

    System.out.println(aaron.toString());   // 객체
  }
}
