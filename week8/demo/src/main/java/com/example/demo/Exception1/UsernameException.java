package com.example.demo.Exception1;

public class UsernameException extends RuntimeException {

  public UsernameException() {
    super("데이터베이스 접속에 필요한 Username 입력은 필수입니다.");
  }
}
