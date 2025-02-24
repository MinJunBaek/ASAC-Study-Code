package com.example.demo.hero.common;

public interface HeroRepository<T, F> {

  T findById(F id);
}
