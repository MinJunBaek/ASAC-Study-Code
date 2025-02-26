package com.example.demo;

import com.example.demo.travel.TravelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DemoApplication {

  public static void main(String[] args) {
    TravelService service = new TravelService();
    try {
      service.reservation();
    } catch (Exception e) {
      log.error("예약 시 에러 발생 - (1) 한곳에서 다 처리하기", e);
    }
  }
}
