package com.example.demo;

import java.sql.SQLException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DemoApplication {

  static void connect(String username, String password) {
    try {
      if (username.equals("admin") && password.equals("1234")) {
        System.out.println("- Database is connected successfully.");
      } else {
        throw new SQLException("데이터베이스 접속 실패"); // throw로 예외를 발생시킴
      }
    } catch (SQLException e) {
      log.error(String.format("데이터 베이스 계정 불일치 - username: %s, password: %s", username, password), e);
      // e를 붙여야 어디서 발생했는지 알수있음
      // log.error("데이터 베이스 계정 불일치 - username: {}, password: {}", username, password, e);
    }
  }

  public static void main(String[] args) { // throws SQLException 발생 가능성 선언과 같다
    connect("admin", "1234");
    connect("user", "9876");
  }
}
