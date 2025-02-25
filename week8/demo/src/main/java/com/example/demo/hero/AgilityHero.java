package com.example.demo.hero;

import com.example.demo.hero.common.Hero;

public class AgilityHero extends Hero {

  public AgilityHero(String name) {
    super(name);
  }

  protected void printHero() {
    System.out.print("[Agility Hero] ");
  }

  @Override
  protected void attack() {
    System.out.println("더블 어택");
  }

  @Override
  protected void ultimate() {
    System.out.println("연사");
  }
}
