package com.example.demo;

import com.example.demo.dto.MemberCreateRequestDto;
import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    MemberCreateRequestDto requestDto = new MemberCreateRequestDto("Baron", "baron@example.com");

//    Member aaron = new Member(1, "Aaron", 10, "aaron@example.com"); // 생성자라 Private 가 되었으므로 외부에서 호출이 불가하다.
    Member baron = Member.from(requestDto);

//  System.out.println("---");
//  System.out.println(aaron);              // 객체
//  System.out.println(aaron.toString());   // 객체
//  System.out.println(aaron.getName());    // 필드 중 name
//  System.out.println(aaron.name);         // 필드 중 name (접근제어자 private)

    System.out.println("---");
    System.out.println(baron);              // 객체
    System.out.println(baron.toString());   // 객체
    System.out.println(baron.getName());    // 필드 중 name
//  System.out.println(baron.name);         // 필드 중 name (접근제어자 private)
  }
}
