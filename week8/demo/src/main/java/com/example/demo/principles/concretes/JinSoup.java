package com.example.demo.principles.concretes;

import com.example.demo.principles.interfaces.Soup;

public class JinSoup implements Soup {

  @Override
  public void input() {
    System.out.println("진라면 스프 넣기");
  }

  @Override
  public void onion() {
  }

  @Override
  public void egg() {
    System.out.println("계란 넣기");
  }

}
