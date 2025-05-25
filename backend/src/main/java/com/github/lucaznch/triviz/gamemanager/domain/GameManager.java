package com.github.lucaznch.triviz.gamemanager.domain;

import org.springframework.stereotype.Component;

import com.github.lucaznch.triviz.game.domain.Game;

import java.util.List;
import java.util.ArrayList;

@Component
public class GameManager {

    private List<Game> games = new ArrayList<>();
    private static Integer id = 0;

    public GameManager() {
        // initialize with some default games
        games.add(new Game(id++, "Harry Potter Quiz", "Movies", "Easy"));
        games.add(new Game(id++, "Modern Science Quiz", "Science", "Medium"));
        games.add(new Game(id++, "England History Quiz", "History", "Hard"));
    }

    public List<Game> getGames() {
        return games;
    }

    public Game getRandomGame() {
        // for testing purposes, return the first game
        return games.get(0);
    }

    public Game createGame(String name, String category, String level) {
        Game newGame = new Game(id++, name, category, level);
        games.add(newGame);
        return newGame;
    }

}

