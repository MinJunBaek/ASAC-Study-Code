package com.example.demo;

import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  static class Member {

    private Integer id;     // Reference Type 주소를 담는 그릇 : 객체가 담기며, NULL 이 들어갈 수 있다.
    private String name;
    private int age;        // Primitive Type 값을 담는 그릇 : 값 그 자체가 담기며, NULL 이 들어갈 수 없다. (무조건 값이 있어야하기에 기본값 존재)
    private String email;

    public Member(String name, String email) {
      // this.id = null; // Reference Type 이기 때문에 값을 설정하지 않으면 NULL 이 들어간다.
      this.name = name;
      // this.age = 0;   // Primitive Type 이기 때문에 값을 설정하지 않으면 기본값 0 이 들어간다.
      this.email = email;
    }

    public String getName() {
      return this.name;
    }
  }

  public static void main(String[] args) {
    Member aaron = new Member("Aaron", "aaron@example.com");
    Member baron = new Member("Baron", "baron@example.com");

    System.out.println("---");
    System.out.println(aaron);              // 객체
    System.out.println(aaron.toString());   // 객체
    System.out.println(aaron.getName());    // 필드 중 name
    System.out.println(aaron.name);         // 필드 중 name (접근제어자 private)

    System.out.println("---");
    System.out.println(baron);              // 객체
    System.out.println(baron.toString());   // 객체
    System.out.println(baron.getName());    // 필드 중 name
    System.out.println(baron.name);         // 필드 중 name (접근제어자 private)
  }

}
