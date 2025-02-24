package com.example.demo.hero.common;

public interface HeroCreateRepository<T extends Hero, F> {

  /* public : abstract 와 default 는 공존할 수 없다. 두개가 합쳐 사용될 수 없다 = default 정의 후 @Override */
  default F save(T hero) {
    throw new RuntimeException("have to be implemented : F save(T hero)");
  }

}
