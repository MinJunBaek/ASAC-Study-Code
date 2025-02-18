package com.example.demo;

import com.example.demo.member.Administrator;
import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    Administrator aaron = new Administrator("Aaron", "aaron@example.com", "DEVELOPER");
    Administrator baron = new Administrator("Baron", "baron@example.com", "DESIGNER");

    System.out.println("---");
    System.out.println(aaron);              // 객체
    System.out.println(aaron.toString());   // 객체
    System.out.println(aaron.getName());    // 필드 중 name
//      System.out.println(aaron.name);         // 필드 중 name (접근제어자 private)

    System.out.println("---");
    System.out.println(baron);              // 객체
    System.out.println(baron.toString());   // 객체
    System.out.println(baron.getName());    // 필드 중 name
//      System.out.println(baron.name);         // 필드 중 name (접근제어자 private)
  }

}
