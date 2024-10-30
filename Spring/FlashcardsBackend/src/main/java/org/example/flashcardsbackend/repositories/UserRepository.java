package org.example.flashcardsbackend.repositories;

import org.example.flashcardsbackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
