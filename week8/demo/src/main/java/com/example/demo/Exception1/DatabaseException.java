package com.example.demo.Exception1;

public class DatabaseException extends RuntimeException {

  public DatabaseException() {
    super("데이터베이스 접속 실패");
  }
}
