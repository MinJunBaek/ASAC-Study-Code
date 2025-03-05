package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements IRepository<Integer, User> {

  private static final Map<Integer, User> users;

  static {
    users = new HashMap<>();
    users.put(1, new User(1, "Aaron", 10, "Developer", "Backend"));
    users.put(2, new User(2, "Baron", 20, "Developer", "Frontend"));
    users.put(3, new User(3, "Caron", 30, "Engineer", "DevOps/SRE"));
  }

  @Override
  public User findById(Integer id) {
    return users.get(id);
  }

  @Override
  public List<User> findAll() {
    return users.values().stream().toList();
  }

  @Override
  public User save(User entity) {
    int generatedId = users.size();
    entity.setId(generatedId);
    return users.put(generatedId, entity);
  }
}
