package com.example.demo.type;

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
}
