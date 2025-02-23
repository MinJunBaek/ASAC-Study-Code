package com.example.demo;

import com.example.demo.hero.AgilityHero;
import com.example.demo.hero.IntelligenceHero;
import com.example.demo.hero.StrengthHero;
import com.example.demo.hero.common.Hero;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    Hero strength = new StrengthHero();
    Hero agility = new AgilityHero();
    Hero intelligence = new IntelligenceHero();

    Map<String, Hero> hero_map = new HashMap<>();
    hero_map.put("힘", strength);
    hero_map.put("민", agility);
    hero_map.put("지", intelligence);

    System.out.println("-- Map<String, Hero> hero_map --");
    System.out.println("- 🟥 힘 속성 영웅");
    hero_map.get("힘").attack();
    hero_map.get("힘").ultimate();
    ((StrengthHero) strength).berserk(); // 인터페이스 공통 형상 메서드만 호출 가능 = 인터페이스 다형성(Polymorphism)

    System.out.println("- 🟩 민첩 속성 영웅");
    hero_map.get("민").attack();
    hero_map.get("민").ultimate();

    System.out.println("- 🟦 지능 속성 영웅");
    hero_map.get("지").attack();
    hero_map.get("지").ultimate();

    System.out.println("----------------------------------");

    List<Hero> hero_list = new ArrayList<>();
    hero_list.add(strength);
    hero_list.add(agility);
    hero_list.add(intelligence);

    System.out.println("-- List<Hero> hero_list --");
    System.out.println("- 🟥 힘 속성 영웅");
    hero_list.get(0).attack();
    hero_list.get(0).ultimate();

    System.out.println("- 🟩 민첩 속성 영웅");
    hero_list.get(1).attack();
    hero_list.get(1).ultimate();

    System.out.println("- 🟦 지능 속성 영웅");
    hero_list.get(2).attack();
    hero_list.get(2).ultimate();

  }

}
