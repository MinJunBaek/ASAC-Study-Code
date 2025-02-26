package com.example.demo.travel;

import com.example.demo.exception.DatabaseException;
import com.example.demo.exception.PasswordException;
import com.example.demo.exception.UsernameException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

@Slf4j
public class Database {

  public void connect(String username, String password) {
    if (!StringUtils.hasLength(username)) {
      throw new UsernameException();
    }
    if (!StringUtils.hasLength(password)) {
      throw new PasswordException();
    }
    if (!(username.equals("admin") && password.equals("1234"))) {
      throw new DatabaseException();
    }
    if (false/* 강제로 예외를 발생시키기 위해 if (true) 추가 - 그렇지않으면 '아래부터 실행되지 않는데 코드가 있다'는 빌드 오류 */) {
      throw new RuntimeException("Cannot connect to the Database Server");
    }
    log.info("- Database is connected successfully.");
  }

  public void save(String data) {
    log.info("{} 데이터 저장 완료", data);
  }
}
