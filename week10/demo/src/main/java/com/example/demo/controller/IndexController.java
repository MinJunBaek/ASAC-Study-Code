package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// @Controller + @ResponseBody = @RestController
@RestController
public class IndexController {

  // @ResponseBody는 컨트롤러의 반환 값을 HTTP 응답 본문(body)에 직접 넣어서 반환하는 역할을 함. 즉, 뷰를 찾지 않고 데이터 자체를 반환
  // "index" 라는 문자열 자체가 클라이언트(브라우저)로 전송
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index() {
    return "index";
//      return "index.html";
//      다음 디렉토리에 존재하는 파일 = /resources/templates/index.html
  }
}