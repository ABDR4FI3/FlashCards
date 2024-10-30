package org.example.flashcardsbackend.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String profileImage;
    private Double score;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserCategoryProgress> categoryProgresses;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserQuizSetProgress> quizSetProgresses;

}
