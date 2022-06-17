package com.sparta.spring02.repository;

import com.sparta.spring02.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
