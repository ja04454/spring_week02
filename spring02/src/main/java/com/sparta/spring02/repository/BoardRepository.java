package com.sparta.spring02.repository;

import com.sparta.spring02.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
