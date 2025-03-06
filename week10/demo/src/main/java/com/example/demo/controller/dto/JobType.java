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

  // 출력시 name필드만 출력된다.
  @JsonValue
  String name;
  List<String> titles;
}
