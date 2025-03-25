package com.example.demo.service;

import com.example.demo.controller.dto.UserRequestDto;
import com.example.demo.controller.dto.UserResponseDto;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.entity.User;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  @Transactional(readOnly = true)
  public List<UserResponseDto> findAll() {
    List<User> retrieved = userRepository.findAll();
    return retrieved.stream().map(UserResponseDto::of).toList();
  }

  @Transactional(readOnly = true)
  public UserResponseDto insert(UserRequestDto request) {
    User toSave = request.toEntity();
    User saved = userRepository.save(toSave);
    return UserResponseDto.of(saved);
  }
}
