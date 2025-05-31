package com.github.lucaznch.triviz.game.dto;

import com.github.lucaznch.triviz.game.domain.Game;
import com.github.lucaznch.triviz.question.dto.QuestionDto;

import java.util.List;

public class GameDto {

    private Integer id;
    private String name;
    private String category;
    private String level;
    private List<QuestionDto> questions;

    public GameDto() {
    }
    
    public GameDto(Game game) {
        setId(game.getId());
        setName(game.getName());
        setCategory(game.getCategory());
        setLevel(game.getLevel());
        setQuestions(game.getQuestions().stream()
                    .map(question -> new QuestionDto(question))
                    .toList());
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

    public List<QuestionDto> getQuestions() {
        return questions;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void setQuestions(List<QuestionDto> questions) {
        this.questions = questions;
    }
}

