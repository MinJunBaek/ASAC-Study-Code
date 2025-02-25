package com.example.demo;

import com.example.demo.type.MessageType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void createMessage(MessageType message) {
    System.out.println("당신에게 메세지를 보냅니다. : " + message.getMessage());
  }

  public static void main(String[] args) {
//    createMessage("안녕하세요.");
    createMessage(MessageType.LOVE);
    createMessage(MessageType.THANKS);
//    createMessage("안녕히가세요.");
  }

}
