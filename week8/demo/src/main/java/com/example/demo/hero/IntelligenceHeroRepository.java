package com.example.demo.hero;

import com.example.demo.hero.common.HeroRepository;
import java.util.HashMap;
import java.util.Map;

public class IntelligenceHeroRepository implements HeroRepository<IntelligenceHero, String> {

  public static Map<String, IntelligenceHero> repository = new HashMap<>();

  public IntelligenceHero findById(String name) {
    return repository.get(name);
  }

  public String save(IntelligenceHero hero) {
    repository.put(hero.getName(), hero);
    return hero.getName();
  }

  public void delete(String name) {
    repository.remove(name);
  }


}
