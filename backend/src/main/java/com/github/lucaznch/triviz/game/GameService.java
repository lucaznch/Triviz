package com.github.lucaznch.triviz.game;

import com.github.lucaznch.triviz.game.dto.GameDto;
import com.github.lucaznch.triviz.game.repository.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Isolation;

import java.util.List;
import java.util.ArrayList;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    @Transactional(isolation = Isolation.READ_COMMITTED)
    public List<GameDto> getGames() {
        return gameRepository.findAll()
                                  .stream()
                                  .map(game -> new GameDto(game))
                                  .toList();
    }
}