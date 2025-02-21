package com.example.demo;

import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    Member aaron = new Member(1, "Aaron", 10, "aaron@example.com");

    System.out.println("---");
    System.out.println(aaron);              // 객체 주소 (aaron 주소값 == baron 주소값)
    System.out.println(aaron.toString());   // 객체
  }
}
