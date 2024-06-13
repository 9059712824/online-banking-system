package com.learning.onlinebankingsystem.repository;

import com.learning.onlinebankingsystem.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UserRoleRepository extends JpaRepository<UserRole, UUID> {
    List<UserRole> findByUser_Uuid(UUID uuid);
}
