package com.example.demo.domain.users.repository;

import com.example.demo.domain.users.repository.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findUserByUserEmail(String userEmail);
}
