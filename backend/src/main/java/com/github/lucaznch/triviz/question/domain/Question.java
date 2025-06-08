package com.github.lucaznch.triviz.question.domain;

import com.github.lucaznch.triviz.question.dto.QuestionDto;
import com.github.lucaznch.triviz.game.domain.Game;

import jakarta.persistence.*;

import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String question;
    private String answer;
    private String category;
    private String level;

    @ManyToMany(mappedBy = "questions")
    private List<Game> games = new ArrayList<>();

    public Question() {
    }

    public Question(QuestionDto questionDto) {
        setQuestion(questionDto.getQuestion());
        setAnswer(questionDto.getAnswer());
        setCategory(questionDto.getCategory());
        setLevel(questionDto.getLevel());
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

    public List<Game> getGames() {
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

    public void addGame(Game game) {
        if (game != null && !games.contains(game)) {
            games.add(game);
            game.addQuestion(this);
        }
    }
}

