package org.example.flashcardsbackend.repositories;

import org.example.flashcardsbackend.entities.UserQuizSetProgress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserQuizSetProgressRepository extends JpaRepository<UserQuizSetProgress, Long> {
}
