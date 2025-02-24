package com.example.demo.hero;

import com.example.demo.hero.common.HeroCreateRepository;
import com.example.demo.hero.common.HeroDeleteRepository;
import com.example.demo.hero.common.HeroReadRepository;
import com.example.demo.hero.common.HeroRepository;
import java.util.HashMap;
import java.util.Map;

public class StrengthHeroRepository implements HeroCreateRepository<StrengthHero, String>,
    HeroDeleteRepository<StrengthHero, String>,
    HeroReadRepository<StrengthHero, String> {

  public static Map<String, StrengthHero> repository = new HashMap<>();

  public StrengthHero findById(String name) {
    return repository.get(name);
  }

  public String save(StrengthHero hero) {
    repository.put(hero.getName(), hero);
    return hero.getName();
  }

  public void delete(String name) {
    repository.remove(name);
  }
}
