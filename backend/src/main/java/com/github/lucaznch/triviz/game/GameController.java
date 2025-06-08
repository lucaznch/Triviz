package com.github.lucaznch.triviz.game;

import com.github.lucaznch.triviz.game.dto.GameDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;


    @GetMapping("/all")
    public List<GameDto> getGames() {
        return gameService.getGames();
    }
}

