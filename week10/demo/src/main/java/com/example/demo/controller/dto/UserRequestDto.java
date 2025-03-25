package com.example.demo.controller.dto;

import com.example.demo.repository.entity.User;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // final이 붙은 녀석들을 자동으로 생성자에 만들어줌
public class UserRequestDto { // 클라이언트에서 요청을 보낼 때 사용됨. (User 엔티티를 사용하면 데이터를 불필요한 데이터 노출)

  private final Integer id;
  private final String name;

  public User toEntity() {
    return new User(this.name);
  }
}
