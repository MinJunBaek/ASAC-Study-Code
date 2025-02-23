package com.example.demo.hero;

import com.example.demo.hero.common.Hero;

public class IntelligenceHero implements Hero {

  @Override
  public void attack() {
    System.out.println("파이어볼");
  }

  @Override
  public void ultimate() {
    System.out.println("메테오");
  }
}
