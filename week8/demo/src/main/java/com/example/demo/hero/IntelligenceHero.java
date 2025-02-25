package com.example.demo.hero;

import com.example.demo.hero.common.Hero;

public class IntelligenceHero extends Hero {

  public IntelligenceHero(String name) {
    super(name);
  }

//  protected void printHero() {
//    System.out.print("[Intelligence Hero] ");
//  }

  @Override
  protected void attack() {
    System.out.println("파이어볼");
  }

  @Override
  protected void ultimate() {
    System.out.println("메테오");
  }
}
