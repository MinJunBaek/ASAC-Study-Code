package com.example.demo.hero.common;

public interface HeroRepository<T extends Hero, F> extends HeroReadRepository<T, F>, HeroCreateRepository<T, F>,
    HeroDeleteRepository<T, F> {

}
