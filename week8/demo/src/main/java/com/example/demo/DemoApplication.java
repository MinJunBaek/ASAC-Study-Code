package com.example.demo;

import com.example.demo.member.Member;
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

//    Member.Favorite non_static_favorite_1 = member.new Favorite(Arrays.asList("BOOK", "COOK"));
//    Member.Favorite non_static_favorite_2 = new Member().new Favorite(Arrays.asList("BOOK", "COOK"));
    Member.Favorite static_favorite = new Member.Favorite(Arrays.asList("BOOK", "COOK"));

    OuterClass outerClass = new OuterClass();

    outerClass.new InnerClass().publicMethod(); // 일반 클래스 내 정적 메서드 - 객체를 통해 객체화(new InnerClass)를 한 후 메서드 호출 (정상사용 X)
    OuterClass.InnerClass.publicMethod();       // 일반 클래스 내 정적 메서드 (정상사용 O) - 정적 메서드가 일반 클래스에 있든,
    OuterClass.StaticInnerClass.publicMethod(); // 정적 클래스 내 정적 메서드 (정상사용 O) - 정적 메서드가 정적 클래스에 있든 상관없다.
  }
}
