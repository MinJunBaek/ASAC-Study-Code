package com.example.demo.hero.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class Hero {

  private final String name;

  protected void printHero() {
    System.out.printf("[%s] ", this.name);
  }

  public void heroAttack() {
    printHero();
    attack();
  }

  protected abstract void attack();

  public void heroUltimate() {
    printHero();
    attack();
  }

  protected abstract void ultimate();
}
