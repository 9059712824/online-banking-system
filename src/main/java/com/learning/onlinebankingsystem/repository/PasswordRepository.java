package com.learning.onlinebankingsystem.repository;

import com.learning.onlinebankingsystem.entity.Password;
import com.learning.onlinebankingsystem.entity.PasswordStatus;
import com.learning.onlinebankingsystem.entity.PasswordType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PasswordRepository extends JpaRepository<Password, UUID> {
    Password findByUser_UuidAndTypeAndStatus(UUID userUuid, PasswordType type, PasswordStatus status);
}
