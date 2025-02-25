package com.example.demo.hero;

import com.example.demo.hero.common.Hero;

public class StrengthHero extends Hero {

  public StrengthHero(String name) {
    super(name);
  }

  protected void printHero() {
    System.out.print("[Strength Hero] ");
  }

  @Override
  protected void attack() {
    System.out.println("배쉬 어택");
  }

  @Override
  protected void ultimate() {
    System.out.println("지진 생성");
  }

  public void heroBerserk() {
    System.out.println("각성");
  }
}
