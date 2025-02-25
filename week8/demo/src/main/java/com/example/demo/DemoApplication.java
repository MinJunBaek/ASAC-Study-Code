package com.example.demo;

import com.example.demo.principles.Ramen;
import com.example.demo.principles.concretes.Noodle;
import com.example.demo.principles.concretes.Soup;
import com.example.demo.principles.concretes.Water;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    Ramen ramen = new Ramen(new Water(), new Soup(), new Noodle());
    ramen.make();
  }

}
