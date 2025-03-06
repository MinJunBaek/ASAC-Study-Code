package com.example.demo.service;

import com.example.demo.controller.dto.UserResponseDto;
import java.time.LocalDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public UserResponseDto findById(Integer id) {
    User user = userRepository.findById(id);
    return UserResponseDto.from(user);
  }

  public List<UserResponseDto> findAll() {
    return userRepository.findAll()
        .stream()
        .map((user) -> UserResponseDto.from(user))
        .toList();
  }

  public UserResponseDto save(String name, Integer age, String job, String specialty) {
    User user = userRepository.save(new User(null, name, age, job, specialty, LocalDateTime.now()));
    return UserResponseDto.from(user);
  }
}
