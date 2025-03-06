package com.example.demo.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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
  // @JsonProperty("Developer 개발자") 아무것도 설정하지 않으면 기본값(Enum의 이름)이 출력된다.
  DEVELOPER("Developer", Arrays.asList("Frontend", "Backend")),
  ENGINEER("Engineer", Arrays.asList("DevOps", "SRE"));

  String name;
  List<String> titles;

}
