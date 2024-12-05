package com.panchanama.repository;

import com.panchanama.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    // Custom query if needed
    User findByEmail(String email);
}
