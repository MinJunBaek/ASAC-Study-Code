package com.example.demo;

import java.sql.SQLException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  static void connect(String username, String password) {
    try {
      if (username.equals("admin") && password.equals("1234")) {
        System.out.println("- Database is connected successfully.");
      } else {
        throw new SQLException("데이터베이스 접속 실패"); // throw로 예외를 발생시킴
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) { // throws SQLException 발생 가능성 선언과 같다
    connect("admin", "1234");
    connect("user", "9876");
  }
}
