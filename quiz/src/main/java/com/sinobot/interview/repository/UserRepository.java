package com.sinobot.interview.repository;

import java.util.UUID;

import com.sinobot.interview.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
