package org.example.flashcardsbackend.repositories;

import org.example.flashcardsbackend.entities.QuizSet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizSetRepository extends JpaRepository<QuizSet, Long> {
}
