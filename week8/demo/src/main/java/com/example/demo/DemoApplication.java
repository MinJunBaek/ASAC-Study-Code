package com.example.demo;

import com.example.demo.type.MessageType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void createMessage(String message) {
    MessageType messageType = MessageType.findByName(message);
    System.out.println("당신에게 메세지를 보냅니다. : " + messageType.getMessage());
    System.out.println("다음으로부터 전송되었습니다. : " + messageType.getMedia().getSender());
  }

  public static void main(String[] args) {
//    createMessage("안녕하세요.");
    createMessage("LOVE");
    createMessage("THANKS");
//    createMessage("안녕히가세요.");
    createMessage("HATES");
  }

}
