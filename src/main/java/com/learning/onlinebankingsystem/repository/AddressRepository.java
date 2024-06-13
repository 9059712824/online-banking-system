package com.learning.onlinebankingsystem.repository;

import com.learning.onlinebankingsystem.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
