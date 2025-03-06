package com.example.demo.controller.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;
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

  // Json데이터를 자바 객체로 변환할때 사용
  // DELEGATING 모드를 사용하면 JSON의 단일 값을 특정 필드에 매핑하도록 설정할수 있음.
  // 즉, JSON에서 하나의 값을 전체 객체로 변환할 때 특정 필드에 전달하여 처리하도록 위임 하는 방식
  // DELEGATING는 특정 필드를 deserialize(String name)를 통해 자동으로 매핑해줌
  // 자동 매핑이 싫다면 PROPERTIES를 사용하고 deserialize(@JsonProperty("name") String name)이라고 작성하면 됨.
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  public static JobType deserialize(String name) {
    for (JobType each : JobType.values()) {
      if (each.getName().equals(name)) {
        return each;
      }
    }
    throw new RuntimeException("JobType 내 해당하는 Enum 이 존재하지 않습니다. name : " + name);
  }
}