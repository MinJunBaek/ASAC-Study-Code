package com.example.demo.exception;

public class CustomException extends RuntimeException {

  private String type;
  private int priority;

  public CustomException(String type, int priority, String message) {
    super(message);
    this.type = type;
    this.priority = priority;
  }

  public String getType() {
    return type;
  }

  public int getPriority() {
    return priority;
  }
}
