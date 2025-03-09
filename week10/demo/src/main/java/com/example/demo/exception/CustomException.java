package com.example.demo.exception;

import java.util.Objects;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {

  private ExceptionType type;

  public CustomException(ExceptionType type) {
    super();
  }

  public CustomException(ExceptionType type, Objects message) {
    super(type.getDesc() + message.toString());
    this.type = type;
  }
}
