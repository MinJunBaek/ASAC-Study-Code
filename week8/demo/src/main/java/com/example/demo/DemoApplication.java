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

  public static void main(String[] args) {
    StrengthHeroRepository strengthHeroRepository = new StrengthHeroRepository();
    strengthHeroRepository.save(new StrengthHero("Dragon Knight"));
    strengthHeroRepository.save(new StrengthHero("Pudge"));
    strengthHeroRepository.save(new StrengthHero("Slardar"));
    strengthHeroRepository.delete("Pudge");

    AgilityHeroRepository agilityRepository = new AgilityHeroRepository();
    agilityRepository.save(new AgilityHero("Weaver"));
    agilityRepository.save(new AgilityHero("Slark"));
    agilityRepository.save(new AgilityHero("Juggernaut"));
    agilityRepository.delete("Weaver");

    IntelligenceHeroRepository intelligenceRepository = new IntelligenceHeroRepository();
    intelligenceRepository.save(new IntelligenceHero("Puck"));
    intelligenceRepository.save(new IntelligenceHero("Crystal Maiden"));
    intelligenceRepository.save(new IntelligenceHero("Zeus"));
    intelligenceRepository.delete("Puck");

    // Hero strength = strengthHeroRepository.findById("Slardar");
    Hero strength = strengthHeroRepository.findById("Slardar");
    // Hero agility = agilityRepository.findById("Slark");
    Hero agility = agilityRepository.findById("Slark");
    // Hero intelligence = intelligenceRepository.findById("Zeus");
    Hero intelligence = intelligenceRepository.findById("Zeus");

    System.out.println("- 🟥 힘 속성 영웅");
    System.out.println(strength.getName());     // 인터페이스 다형성(Polymorphism) 상관없이 구체(구현)클래스 내 메서드 호출 가능
    strength.heroAttack();
    strength.heroUltimate();
    ((StrengthHero) strength).heroBerserk(); // 인터페이스 다형성(Polymorphism) 상관없이 구체(구현)클래스 내 메서드 호출 가능

    System.out.println("- 🟩 민첩 속성 영웅");
    System.out.println(agility.getName());      // 인터페이스 다형성(Polymorphism) 상관없이 구체(구현)클래스 내 메서드 호출 가능
    agility.heroAttack();
    agility.heroUltimate();

    System.out.println("- 🟦 지능 속성 영웅");
    System.out.println(intelligence.getName()); // 인터페이스 다형성(Polymorphism) 상관없이 구체(구현)클래스 내 메서드 호출 가능
    intelligence.heroAttack();
    intelligence.heroUltimate();

  }

}
