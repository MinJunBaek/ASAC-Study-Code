package com.example.demo;

import com.example.demo.exception.DatabaseException;
import com.example.demo.exception.PasswordException;
import com.example.demo.exception.UsernameException;
import java.sql.SQLException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

@SpringBootApplication
@Slf4j
public class DemoApplication {

  static void connect(String username, String password) {
    if (!StringUtils.hasLength(username)) {
      throw new UsernameException();
    }
    if (!StringUtils.hasLength(password)) {
      throw new PasswordException();
    }
    if (!(username.equals("admin") && password.equals("1234"))) {
      throw new DatabaseException();
    }
    log.info("- Database is connected successfully.");
  }

  public static void main(String[] args) { // throws SQLException 발생 가능성 선언과 같다
    try {
      // connect(null, "9876");
      // connect("user", null);
      // connect("user", "9876");
      connect("admin", "1234");
    } catch (UsernameException e) {
      log.warn("유저가 존재하지 않는 아이디를 입력 중", e);
    } catch (PasswordException e) {
      log.warn("유저가 잘못된 비밀번호를 입력 중", e);
    } catch (DatabaseException e) {
      log.warn("잘못된 유저 정보로인한 데이터베이스 접속 실패", e);
    }
  }
}
