package com.jin.MyDomitory.repository;

import com.jin.MyDomitory.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board,Long> {
}
