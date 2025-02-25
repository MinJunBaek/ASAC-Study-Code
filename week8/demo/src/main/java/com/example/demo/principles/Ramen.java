package com.example.demo.principles;

import com.example.demo.principles.concretes.Noodle;
import com.example.demo.principles.concretes.Water;
import com.example.demo.principles.interfaces.Egg;
import com.example.demo.principles.interfaces.Onion;
import com.example.demo.principles.interfaces.Soup;

public class Ramen {

  private final Water water;
  private final Soup soup;
  private final Onion onion;
  private final Egg egg;
  private final Noodle noodle;

  public Ramen(Water water, Soup soup, Onion onion, Egg egg, Noodle noodle) {
    this.water = water;
    this.soup = soup;
    this.onion = onion;
    this.egg = egg;
    this.noodle = noodle;
  }

  public void make() {
    water.input();
    soup.input();
    onion.input();
    egg.input();
    noodle.input();
  }

}
