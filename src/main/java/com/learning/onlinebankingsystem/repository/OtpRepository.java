package com.learning.onlinebankingsystem.repository;

import com.learning.onlinebankingsystem.entity.Otp;
import com.learning.onlinebankingsystem.entity.OtpStatus;
import com.learning.onlinebankingsystem.entity.OtpType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OtpRepository extends JpaRepository<Otp, UUID> {
    Otp findByUser_UuidAndStatusAndType(UUID userId, OtpStatus status, OtpType type);
}
