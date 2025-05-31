package com.github.lucaznch.triviz.game.domain;

import com.github.lucaznch.triviz.game.dto.GameDto;
import com.github.lucaznch.triviz.question.domain.Question;

import jakarta.persistence.*;

import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String category;
    private String level;

    @ManyToMany
    @JoinTable(name = "game_questions")
    private List<Question> questions = new ArrayList<>();

    public Game() {
        // default constructor for JPA
    }

    public Game(GameDto gameDto) {
        setName(gameDto.getName());
        setCategory(gameDto.getCategory());
        setLevel(gameDto.getLevel());

        // TODO: verify invariants
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getLevel() {
        return level;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void addQuestion(Question question) {
        if (question != null && !questions.contains(question)) {
            questions.add(question);
            question.addGame(this);
        }
    }
}