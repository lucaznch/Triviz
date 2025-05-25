package com.github.lucaznch.triviz.gamemanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.lucaznch.triviz.game.domain.Game;
import com.github.lucaznch.triviz.gamemanager.domain.GameManager;

@Service
public class GameManagerService {

    private final GameManager gameManager;

    @Autowired
    public GameManagerService(GameManager gameManager) {
        this.gameManager = gameManager;
    }
    

    public Game getRandomGame() {
        return gameManager.getRandomGame();
    }
}

