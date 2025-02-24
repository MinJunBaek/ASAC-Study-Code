package com.example.demo.hero.common;

public interface HeroRepository<T extends Hero, F> {

  T findById(F id);
}
