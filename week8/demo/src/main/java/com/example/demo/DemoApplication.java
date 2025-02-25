package com.example.demo;

import com.example.demo.principles.Ramen;
import com.example.demo.type.MessageType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    Ramen ramen = new Ramen();
    ramen.make();
  }

}
