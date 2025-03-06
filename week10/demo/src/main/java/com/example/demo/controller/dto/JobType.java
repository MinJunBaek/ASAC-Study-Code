package com.example.demo.controller.dto;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum JobType {
  DEVELOPER("Developer", Arrays.asList("Frontend", "Backend")),
  ENGINEER("Engineer", Arrays.asList("DevOps", "SRE"));

  String name;
  List<String> titles;

  // 객체가 JSON으로 변환될 때 사용될 값을 지정하는 Jackson 어노테이션
  // 보통 필드나 메서드에 적용가능한데 메서드에 적용하면 값을 원하는 형식으로 포멧팅 하여 출력 할수 있다.
  @JsonValue
  public String serialize() {
    return String.format("명칭 : %s | 종류 : %s", this.name, titles.toString());
  }
}
