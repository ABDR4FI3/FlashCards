package org.example.flashcardsbackend.repositories;

import org.example.flashcardsbackend.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
