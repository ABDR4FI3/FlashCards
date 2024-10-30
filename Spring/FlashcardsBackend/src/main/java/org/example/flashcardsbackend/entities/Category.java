package org.example.flashcardsbackend.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String icon;

    @OneToMany(mappedBy = "category")
    private List<QuizSet> quizSets;

    private Double masteryLevel;
    private Double completionRate;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<UserCategoryProgress> userProgresses;
}