package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public User findById(Integer id) {
    return userRepository.findById(id);
  }

  public List<User> findAll() {
    return userRepository.findAll();
  }

  public User save(String name, Integer age, String job, String specialty) {
    int generateId = userRepository.findAll().size() + 1;
    // put()은 기존 값을 덮어쓰면서 기존 값을 반환
    // 즉, 새로 추가한 User 객체가 반환되지 않고 기존 값(없으면 null)이 반환될 가능성이 있음
    User user = new User(generateId, name, age, job, specialty);
    userRepository.save(new User(null, name, age, job, specialty));
    return user;
  }
}
