package com.example.demo.hero.common;

public interface HeroRepository<T extends Hero, F> {

  public abstract T findById(F id);

  public abstract F save(T hero);

  public abstract void delete(F id);
}
