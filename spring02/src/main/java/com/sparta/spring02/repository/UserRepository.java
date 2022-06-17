package com.sparta.spring02.repository;

import com.sparta.spring02.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
