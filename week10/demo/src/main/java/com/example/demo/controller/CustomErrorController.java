package com.example.demo.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomErrorController implements ErrorController {

  @RequestMapping(value = "/error", method = RequestMethod.GET)
  public ModelAndView handleError(HttpServletRequest request) {
    ModelAndView modelAndView = new ModelAndView();

    Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

    if (status != null) {
      Integer statusCode = Integer.valueOf(status.toString());

      // HttpStatus.NOT_FOUND.value()는 NOT_FOUND의 값(404)를 반환
      if (statusCode == HttpStatus.NOT_FOUND.value()) {
        modelAndView.addObject("status", statusCode);
        // HttpStatus.NOT_FOUND.getReasonPhrase())는 Not Found 라는 문자열 반환
        modelAndView.addObject("reason", HttpStatus.NOT_FOUND.getReasonPhrase());
      } else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
        modelAndView.addObject("status", statusCode);
        modelAndView.addObject("reason", HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
      }
    }
    // 오류 페이지 설정 (뷰 이름을 "error"로 설정하여 src/main/resources/templates/error.html을 찾아 렌더링)
    modelAndView.setViewName("error");
    return modelAndView;
  }
}
