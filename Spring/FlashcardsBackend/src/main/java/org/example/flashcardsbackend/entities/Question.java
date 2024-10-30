package org.example.flashcardsbackend.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private String type;

    @ElementCollection
    private List<String> options;
    private String correctAnswer;
    private String hint;
    private String difficulty;
    private String explanation;
    private String media;

    @ManyToOne
    @JoinColumn(name = "quizSet_id")
    private QuizSet quizSet;
}