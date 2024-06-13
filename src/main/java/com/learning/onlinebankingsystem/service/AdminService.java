package com.learning.onlinebankingsystem.service;

import com.learning.onlinebankingsystem.dto.SuccessResponseDto;
import com.learning.onlinebankingsystem.entity.AdminActionType;
import com.learning.onlinebankingsystem.entity.User;

import java.util.List;
import java.util.UUID;

public interface AdminService {
    SuccessResponseDto actionAccount(UUID userId, AdminActionType adminActionType, String comments);

    List<User> getPendingUsers();
}
