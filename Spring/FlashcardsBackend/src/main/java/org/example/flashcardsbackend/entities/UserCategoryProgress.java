package org.example.flashcardsbackend.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class UserCategoryProgress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    private Integer progress;
    private LocalDateTime lastUpdated;
    private Integer score;
}
