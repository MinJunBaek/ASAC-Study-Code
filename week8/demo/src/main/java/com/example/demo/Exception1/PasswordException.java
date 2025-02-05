package com.example.demo.Exception1;

public class PasswordException extends RuntimeException {

  public PasswordException() {
    super("데이터베이스 접속에 필요한 Password 입력은 필수입니다.");
  }
}
