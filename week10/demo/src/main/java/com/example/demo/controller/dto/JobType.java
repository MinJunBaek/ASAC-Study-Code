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
  @JsonProperty("Developer 개발자") // 등록하려면 job 부분에 Developer 개발자 라고 입력해야함
  DEVELOPER("Developer", Arrays.asList("Frontend", "Backend")),
  @JsonProperty("Engineer 엔지니어")
  ENGINEER("Engineer", Arrays.asList("DevOps", "SRE"));

  String name;
  List<String> titles;

}
