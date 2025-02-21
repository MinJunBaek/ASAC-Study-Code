package com.example.demo;

import com.example.demo.member.Member;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    Member member = new Member(1, "Aaron", 10, "aaron@example.com");

    System.out.println("---");
    System.out.println(member);              // 객체 주소 (aaron 주소값 == baron 주소값)
    System.out.println(member.toString());   // 객체
    System.out.println(member.MEMBER_TO_STRING_FORMAT);
    System.out.println(Member.MEMBER_TO_STRING_FORMAT);
    System.out.println(member.toString(member));
    System.out.println(Member.toString(member));

    Member.Favorite non_static_favorite_1 = member.new Favorite(Arrays.asList("BOOK", "COOK"));
    Member.Favorite non_static_favorite_2 = new Member().new Favorite(Arrays.asList("BOOK", "COOK"));
  }
}
