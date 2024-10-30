package org.example.flashcardsbackend.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class UserQuizSetProgress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quiz_set_id", nullable = false)
    private QuizSet quizSet;

    private Double score;
    private Boolean isMastered;
    private LocalDateTime lastAttempted;

    // Getters and setters
}
