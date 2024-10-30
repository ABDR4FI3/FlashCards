package org.example.flashcardsbackend.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class QuizSet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String difficulty;
    private Integer numberOfQuestions;
    private Boolean isMastered;
    private Double averageScore;
    private Integer timeLimit;

    @ElementCollection
    private List<String> tags;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "quizSet", cascade = CascadeType.ALL)
    private List<Question> questions;

    @OneToMany(mappedBy = "quizSet", cascade = CascadeType.ALL)
    private List<UserQuizSetProgress> userProgresses;
}