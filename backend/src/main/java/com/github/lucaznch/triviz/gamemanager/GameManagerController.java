package com.github.lucaznch.triviz.gamemanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.github.lucaznch.triviz.game.domain.Game;

@RestController
@RequestMapping("/games")
public class GameManagerController {

    private final GameManagerService gameManagerService;

    @Autowired
    public GameManagerController(GameManagerService gameManagerService) {
        this.gameManagerService = gameManagerService;
    }


    @GetMapping
    public Game getRandomGame() {
        return gameManagerService.getRandomGame();
    }

    @GetMapping("/testing")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }
}

