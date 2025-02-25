package com.example.demo.principles.concretes;

import com.example.demo.principles.interfaces.Soup;

public class SinSoup implements Soup {

  @Override
  public void input() {
    System.out.println("신라면 스프 넣기");
  }
}
