package com.example.demo.hero;

import com.example.demo.hero.common.Hero;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class StrengthHero extends Hero {

  private final String name;

  @Override
  public void attack() {
    System.out.println("배쉬 어택");
  }

  @Override
  public void ultimate() {
    System.out.println("지진 생성");
  }

  public void berserk() {
    System.out.println("각성");
  }
}
