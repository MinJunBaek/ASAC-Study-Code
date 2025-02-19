package com.example.demo;

import com.example.demo.member.Administrator;
import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    Administrator aaron = new Administrator(1, "Aaron", 12, "aaron@example.com", "DEVELOPER");
    Administrator baron = new Administrator(1, "Aaron", 12, "aaron@example.com", "DEVELOPER");

    System.out.println("---");
    System.out.println(aaron);              // 객체
    System.out.println(aaron.toString());   // 객체
    System.out.println(aaron.getName());    // @Getter (@Value = 모든 필드에 대해 Getter 생성)
//      aaron.setName("Caron");                 // @Setter (@Value = Setter 미생성) - 어떤것도 호출 불가

    System.out.println("---");
    System.out.println(baron);              // 객체
    System.out.println(baron.toString());   // 객체
    System.out.println(baron.getName());    // @Getter (@Value = 모든 필드에 대해 Getter 생성)
//      baron.setName("Daron");                 // @Setter (@Value = Setter 미생성) - 어떤것도 호출 불가

    System.out.println("---");
    System.out.println(aaron == baron);
    System.out.println(aaron.equals(baron));
  }
}
