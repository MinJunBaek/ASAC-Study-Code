package com.example.demo.exception;

public class DatabaseException extends RuntimeException {

  public DatabaseException() {
    super("데이터 베이스 접속 실패");
  }
}
