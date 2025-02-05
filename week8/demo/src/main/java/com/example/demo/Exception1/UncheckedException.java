package com.example.demo.Exception1;

import java.sql.SQLException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

@Slf4j
@SpringBootApplication
public class UncheckedException {

  public static void connect(String username, String password) {
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

  public static void main(String[] args) {
    try {
      connect(null, "1234"); // 이름이 없을때
      connect("user", null); // 패스워드가 없을때
      connect("user", "1234"); // 이름이 틀렸을때
      connect("admin", "9876"); // 패스워드가 틀렸을때
    } catch (UsernameException e) {
      log.warn(null, e);
    } catch (PasswordException e) {
      log.warn("유저가 잘못된 비밀번호를 입력 중", e);
    } catch (DatabaseException e) {
      log.warn("잘못된 유저 정보로인한 데이터베이스 접속 실패", e);
    }
  }
}
