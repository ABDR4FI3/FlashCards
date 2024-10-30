package org.example.flashcardsbackend.repositories;

import org.example.flashcardsbackend.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
