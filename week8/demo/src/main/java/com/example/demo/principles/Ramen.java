package com.example.demo.principles;

import com.example.demo.principles.concretes.Noodle;
import com.example.demo.principles.concretes.Water;
import com.example.demo.principles.interfaces.Soup;

public class Ramen {

  private final Water water;
  private final Soup soup;
  private final Noodle noodle;

  public Ramen(Water water, Soup soup, Noodle noodle) {
    this.water = water;
    this.soup = soup;
    this.noodle = noodle;
  }

  public void make() {
    water.input();
    soup.input();
    noodle.input();
  }

}
