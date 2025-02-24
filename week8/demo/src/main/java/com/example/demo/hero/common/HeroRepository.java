package com.example.demo.hero.common;

public interface HeroRepository<T extends Hero, F> {

  default T findById(F id) {
    throw new RuntimeException("have to be implemented : T findById(F id)");
  }

  default F save(T hero) {
    throw new RuntimeException("have to be implemented : F save(T hero)");
  }

  default void delete(F id) {
    throw new RuntimeException("have to be implemented : void delete(F id)");
  }
}
