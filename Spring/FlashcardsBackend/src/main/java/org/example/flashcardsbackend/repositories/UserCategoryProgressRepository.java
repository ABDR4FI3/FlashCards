package org.example.flashcardsbackend.repositories;

import org.example.flashcardsbackend.entities.UserCategoryProgress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCategoryProgressRepository extends JpaRepository<UserCategoryProgress, Long> {
}
