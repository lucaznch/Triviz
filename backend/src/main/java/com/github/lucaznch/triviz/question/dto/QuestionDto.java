package com.github.lucaznch.triviz.question.dto;

import com.github.lucaznch.triviz.question.domain.Question;
import com.github.lucaznch.triviz.game.dto.GameDto;

import java.util.List;

public class QuestionDto {

    private Integer id;
    private String question;
    private String answer;
    private String category;
    private String level;
    private List<Integer> games;

    public QuestionDto() {
    }

    public QuestionDto(Question question) {
        setId(question.getId());
        setQuestion(question.getQuestion());
        setAnswer(question.getAnswer());
        setCategory(question.getCategory());
        setLevel(question.getLevel());
        setGames(question.getGames().stream()
                .map(game -> game.getId())
                .toList());
    }

    public Integer getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getCategory() {
        return category;
    }

    public String getLevel() {
        return level;
    }

    public List<Integer> getGames() {
        return games;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setGames(List<Integer> games) {
        this.games = games;
    }
}

