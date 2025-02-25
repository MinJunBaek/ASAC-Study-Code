package com.example.demo.hero.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class Hero {

  private final String name;

  protected final void printHero() {
    System.out.printf("[%s] ", this.name);
  }

  public final void heroAttack() {
    printHero();
    attack();
  }

  protected abstract void attack();

  public final void heroUltimate() {
    printHero();
    ultimate();
  }

  protected abstract void ultimate();
}
