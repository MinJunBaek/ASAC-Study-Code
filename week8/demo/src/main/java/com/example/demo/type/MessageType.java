package com.example.demo.type;

public enum MessageType {
  //  public static final String LOVE = "사랑합니다";
  //  public static final String THANKS = "감사합니다";
  LOVE("사랑합니다."),
  THANKS("감사합니다.");

  private final String message;

  private MessageType(String message) {
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }
}
