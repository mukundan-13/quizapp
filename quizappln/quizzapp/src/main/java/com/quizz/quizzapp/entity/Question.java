package com.quizz.quizzapp.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String questionText;

    private String category;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Option> options;

    private char correctOption; // A, B, C, or D

    public Question() {}

    public Question(String questionText, String category, char correctOption) {
        this.questionText = questionText;
        this.category = category;
        this.correctOption = correctOption;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public char getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(char correctOption) {
        this.correctOption = correctOption;
    }
}
