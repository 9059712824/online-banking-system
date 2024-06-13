package com.learning.onlinebankingsystem.repository;

import com.learning.onlinebankingsystem.entity.Occupation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OccupationRepository extends JpaRepository<Occupation, UUID> {
}
