package com.example.demo.controller.dto;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Jackson 관련 어노테이션을 상속하여 사용하겠다는 의미(날짜 형식을 통일하려는 목적!)
@JacksonAnnotationsInside
// 어노테이션의 유지할 기간을 설정하는것
@Retention(RetentionPolicy.RUNTIME) // RUNTIIME을 설정하면 실행 중에도 어노테이션 정보를 유지할수 있음.
@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
public @interface DateFormat {

}
