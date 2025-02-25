package com.example.demo;

import java.sql.SQLException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  static void connect(String username, String password) throws SQLException {
    if (username.equals("admin") && password.equals("1234")) {
      System.out.println("- Database is connected successfully.");
    } else {
      throw new SQLException("데이터베이스 접속 실패"); // throw로 예외를 발생시킴
      // 조건을 만족하지 않으면, 예외 객체(SQLException)를 생성해서 던짐
      // 이렇게 던진 예외는 connect()를 호출한 곳으로 전달
    }
  }

  public static void main(String[] args) throws SQLException { // throws SQLException 발생 가능성 선언과 같다
    connect("admin", "1234");
    connect("user", "9876");
    // 던져진 예외를 main에서 받아서 main을 호출한 JVM으로 전달
    // JVM이 예외를 받은걸 확인후 오류 메시지 출력 및 비정상적으로 프로그램종료
  }
}
