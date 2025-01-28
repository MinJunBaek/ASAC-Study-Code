package com.example.demo.hero;

import com.example.demo.hero.common.Hero;

public class AgilityHero implements Hero {

    @Override
    public void attack() {
        System.out.println("더블 어택");
    }

    @Override
    public void ultimate() {
        System.out.println("연사");
    }
}