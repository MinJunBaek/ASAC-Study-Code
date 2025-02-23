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

    /* Collection 1) Array 배열 */
//  String[] string_array = new String[3];                      // 길이 기반 Array 선언 (String 요소)
    String[] string_array = new String[]{"1", "2", "3"};        // 값 기반 Array 선언 (String 요소)
    System.out.println(string_array.length);

//  Integer[] integer_array = new Integer[3];                   // 길이 기반 Array 선언 (Integer 요소)
    Integer[] integer_array = new Integer[]{1, 2, 3};           // 값 기반 Array 선언 (Integer 요소)
    System.out.println(integer_array.length);

    System.out.println(string_array);
    System.out.println(integer_array);
  }

}
