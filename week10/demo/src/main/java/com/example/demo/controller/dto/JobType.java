package com.example.demo.controller.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
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
    // 컬렉션(List, Set, Map 등)에서 찾으려는 요소가 없을 때 발생하는 예외
    throw new NoSuchElementException("JobType 내 해당하는 Enum 이 존재하지 않습니다. name : " + name);
    // RuntimeException을 무조건적으로 사용하면 안돼는 이유 : 모든 실행 중 예외의 부모 클래스라 너무 포괄적이어서 구체적인 예외 상황을 파악하기 어럽게 만들수 있음
  }
}