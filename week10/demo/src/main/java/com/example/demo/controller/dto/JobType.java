package com.example.demo.controller.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.Arrays;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

// java의 enum은 JSON 반환 시 이름 문자열만 반환됨.
// Shape.OBJECT를 하면 객체로 변환되어 반환됨.
@JsonFormat(shape = Shape.OBJECT)
// Shape.OBJECT를 사용하여 객체로 변환할때 해당 객체의 값을 가져오기 위해 사용
@Getter
@AllArgsConstructor
// final로 선언한 이유는 불변이어야 하기 때문에
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum JobType {
  // 미리 생성해 놓은 인스턴스들의 집합(ENUM)
  DEVELOPER("Developer", Arrays.asList("Frontend", "Backend")),
  ENGINEER("Engineer", Arrays.asList("DevOps", "SRE"));

  String name;
  List<String> titles;
}
