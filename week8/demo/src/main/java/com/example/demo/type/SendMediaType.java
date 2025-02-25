package com.example.demo.type;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum SendMediaType {
  // class로 구현시 아래와 같음
  //  public static final SendMediaType SNS = new SendMediaType("010-0000-0000");
  //  public static final SendMediaType EMAIL = new SendMediaType("aaron@example.com");

  SNS("010-0000-0000"), EMAIL("aaron@example.com");
  
  String sender;
}
