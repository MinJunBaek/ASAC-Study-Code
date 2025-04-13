package com.example.demo.domain.users.service;

import com.example.demo.domain.users.controller.dto.UserResponseDto;
import com.example.demo.domain.users.controller.dto.UserUpsertRequestDto;
import com.example.demo.domain.users.repository.UserRepository;
import com.example.demo.domain.users.repository.entity.User;
import java.util.List;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
@RequiredArgsConstructor
public class UserService {
  UserRepository userRepository;

  @Transactional(readOnly = true)
  public List<UserResponseDto> findAll() {
    List<User> userList = userRepository.findAll();
    if (userList.isEmpty()) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "등록된 사용자가 없습니다.");
    }
    return userList.stream().map(user -> UserResponseDto.from(user)).toList();
  }

  @Transactional
  public UserResponseDto findById(Integer id) {
    User user = userRepository.findById(id)
        .orElseThrow(() -> {
          log.error("유저를 찾을 수 없습니다. ID : {}", id);
          return new ResponseStatusException(HttpStatus.NOT_FOUND, "유저를 찾을수 없습니다. : " + id);
        });
    UserResponseDto result = UserResponseDto.from(user);
    log.info("유저 반환 완료. ID : {}", id);
    return result;
  }

  @Transactional
  public UserResponseDto save(UserUpsertRequestDto requestDto) {
    User toSave = requestDto.toEntity();
    User saved = userRepository.save(toSave);
    log.info("유저 저장 완료. ID : {}", requestDto.getEmail());
    return UserResponseDto.from(saved);
  }
}
