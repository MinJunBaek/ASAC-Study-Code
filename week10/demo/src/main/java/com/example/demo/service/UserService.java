package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface {

  private static final Map<Integer, User> users;

  static {
    users = new HashMap<>();
    users.put(1, new User(1, "Aaron", 10, "Developer", "Backend"));
    users.put(2, new User(2, "Baron", 20, "Developer", "Frontend"));
    users.put(3, new User(3, "Caron", 30, "Engineer", "DevOps/SRE"));
  }

  public User findById(Integer id) {
    return users.get(id);
  }

  public List<User> findAll() {
    return users.values().stream().toList();
  }

  public User save(String name, Integer age, String job, String specialty) {
    int generateId = users.size() + 1;
    // put()은 기존 값을 덮어쓰면서 기존 값을 반환
    // 즉, 새로 추가한 User 객체가 반환되지 않고 기존 값(없으면 null)이 반환될 가능성이 있음
    User saved = new User(generateId, name, age, job, specialty);
    users.put(generateId, saved);
    return saved;
  }
}
