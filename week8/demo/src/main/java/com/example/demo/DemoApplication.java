package com.example.demo;

import com.example.demo.hero.AgilityHero;
import com.example.demo.hero.AgilityHeroRepository;
import com.example.demo.hero.IntelligenceHero;
import com.example.demo.hero.IntelligenceHeroRepository;
import com.example.demo.hero.StrengthHero;
import com.example.demo.hero.StrengthHeroRepository;
import com.example.demo.hero.common.Hero;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void createMessage(String message) {
    System.out.println("당신에게 메세지를 보냅니다. : " + message);
  }

  public static void main(String[] args) {
    createMessage("안녕하세요.");
    createMessage("사랑합니다.");
    createMessage("감사합니다.");
    createMessage("안녕히가세요.");
  }

}
