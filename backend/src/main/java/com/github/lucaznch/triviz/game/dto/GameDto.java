package com.github.lucaznch.triviz.game.dto;

import com.github.lucaznch.triviz.game.domain.Game;

public class GameDto {

    private Integer id;
    private String name;
    private String category;
    private String level;


    public GameDto() {
    }
    
    public GameDto(Game game) {
        setId(game.getId());
        setName(game.getName());
        setCategory(game.getCategory());
        setLevel(game.getLevel());
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
}

