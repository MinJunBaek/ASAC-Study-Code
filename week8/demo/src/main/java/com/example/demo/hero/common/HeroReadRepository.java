package com.example.demo.hero.common;

public interface HeroReadRepository<T extends Hero, F> {

  /* public : abstract 와 default 는 공존할 수 없다. 두개가 합쳐 사용될 수 없다 = default 정의 후 @Override */
  default T findById(F id) {
    throw new RuntimeException("have to be implemented : T findById(F id)");
  }
}
