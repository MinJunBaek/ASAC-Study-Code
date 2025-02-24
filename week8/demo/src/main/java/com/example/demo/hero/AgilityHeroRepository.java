package com.example.demo.hero;

import com.example.demo.hero.common.HeroCreateRepository;
import com.example.demo.hero.common.HeroDeleteRepository;
import com.example.demo.hero.common.HeroReadRepository;
import java.util.HashMap;
import java.util.Map;

public class AgilityHeroRepository implements HeroReadRepository<AgilityHero, String>,
    HeroCreateRepository<AgilityHero, String>,
    HeroDeleteRepository<AgilityHero, String> {

  public static Map<String, AgilityHero> repository = new HashMap<>();

  public AgilityHero findById(String name) {
    return repository.get(name);
  }

  public String save(AgilityHero hero) {
    repository.put(hero.getName(), hero);
    return hero.getName();
  }

  public void delete(String name) {
    repository.remove(name);
  }
}
