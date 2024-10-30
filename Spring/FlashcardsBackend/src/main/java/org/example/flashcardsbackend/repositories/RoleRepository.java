package org.example.flashcardsbackend.repositories;

import org.example.flashcardsbackend.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
