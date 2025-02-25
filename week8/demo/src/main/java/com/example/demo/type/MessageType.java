package com.example.demo.type;

import java.util.Optional;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum MessageType {
  LOVE("사랑합니다.", SendMediaType.SNS),
  THANKS("감사합니다.", SendMediaType.EMAIL);

  String message;
  SendMediaType media;

  public static MessageType findByName(String name) {
    for (MessageType each : MessageType.values()) {
      if (each.name().equals(name)) {
        return each;
      }
    }
    throw new RuntimeException("ENUM 내 존재하지 않는 이름입니다 : " + name);
  }
}
