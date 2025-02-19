package com.example.demo;

import com.example.demo.member.Administrator;
import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    Administrator aaron = new Administrator(1, "Aaron", 12, "aaron@example.com", "DEVELOPER");
    Administrator baron = new Administrator(1, "Aaron", 24, "aaron@different.com", "DESIGNER");

    System.out.println("---");
    System.out.println(aaron);              // 객체
    System.out.println(aaron.toString());   // 객체

    System.out.println("---");
    System.out.println(baron);              // 객체
    System.out.println(baron.toString());   // 객체

    System.out.println("---");
    System.out.println(aaron == baron);
    System.out.println(aaron.equals(baron));
  }
}
