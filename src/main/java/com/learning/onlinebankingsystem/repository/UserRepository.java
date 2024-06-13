package com.learning.onlinebankingsystem.repository;

import com.learning.onlinebankingsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    User findByEmail(String email);

    User getByAccountNumber(String accountNumber);
}
