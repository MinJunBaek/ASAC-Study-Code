package com.example.demo;

import java.sql.SQLException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  static void connect(String username, String password) {
    if (username.equals("admin") && password.equals("1234")) {
      System.out.println("- Database is connected successfully.");
    } else {
      throw new SQLException("데이터베이스 접속 실패");
    }
  }

  public static void main(String[] args) {
    connect("admin", "1234");
    connect("user", "9876");
  }
}
