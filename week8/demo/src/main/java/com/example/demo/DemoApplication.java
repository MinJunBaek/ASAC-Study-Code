package com.example.demo;

import com.example.demo.hero.AgilityHero;
import com.example.demo.hero.IntelligenceHero;
import com.example.demo.hero.StrengthHero;
import com.example.demo.hero.common.Hero;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    Hero strength = new StrengthHero();
    Hero agility = new AgilityHero();
    Hero intelligence = new IntelligenceHero();

    System.out.println("- 🟥 힘 속성 영웅");
    strength.attack();
    strength.ultimate();
    ((StrengthHero) strength).berserk();

    System.out.println("- 🟩 민첩 속성 영웅");
    agility.attack();
    agility.ultimate();

    System.out.println("- 🟦 지능 속성 영웅");
    intelligence.attack();
    intelligence.ultimate();
  }

}
