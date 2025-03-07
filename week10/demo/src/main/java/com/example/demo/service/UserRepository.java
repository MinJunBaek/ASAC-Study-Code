package com.example.demo.service;

import com.example.demo.controller.dto.JobType;
import com.example.demo.exception.UserNotFoundException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements IRepository<Integer, User> {

  private static final Map<Integer, User> users;

  static {
    users = new HashMap<>();
    users.put(1, new User(1, "Aaron", 10, JobType.DEVELOPER, "Backend", LocalDateTime.now().plusMinutes(10)));
    users.put(2, new User(2, "Baron", 20, JobType.DEVELOPER, "Frontend", LocalDateTime.now().plusMinutes(20)));
    users.put(3, new User(3, "Caron", 30, JobType.ENGINEER, "DevOps/SRE", LocalDateTime.now().plusMinutes(30)));
  }
  
  @Override
  public User findById(Integer id) {
    Optional<User> retrieved = Optional.ofNullable(users.get(id));
    return retrieved.orElseThrow(() -> new UserNotFoundException("유저가 존재하지 않습니다. id : " + id));
  }

  @Override
  public List<User> findAll() {
    return users.values().stream().toList();
  }

  @Override
  public User save(User entity) {
    int generatedId = users.size() + 1;
    entity.setId(generatedId);
    users.put(generatedId, entity);
    return users.get(generatedId);
  }
}
