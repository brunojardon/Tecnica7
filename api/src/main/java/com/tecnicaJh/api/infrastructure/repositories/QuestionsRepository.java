package com.tecnicaJh.api.infrastructure.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tecnicaJh.api.infrastructure.entities.Questions;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Long> {
    List<Questions> findByCategory(String category);
}
