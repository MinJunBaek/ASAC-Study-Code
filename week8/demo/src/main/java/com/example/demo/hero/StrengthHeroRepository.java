package com.example.demo.hero;

import com.example.demo.hero.common.HeroRepository;

import java.util.Map;

public class StrengthHeroRepository implements HeroRepository<StrengthHero, Integer> {

    public static Map<Integer, StrengthHero> repository = Map.of(1, new StrengthHero());

    public StrengthHero findById(Integer id) {
        return repository.get(id);
    }
}