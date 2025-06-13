package com.github.lucaznch.triviz.game;

import com.github.lucaznch.triviz.game.dto.GameDto;
import com.github.lucaznch.triviz.game.repository.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Isolation;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

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

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public GameDto getGameById(Integer gameId) {
        if (gameId == null || gameId <= 0) { throw new IllegalArgumentException("invalid game id"); }
        return gameRepository.findById(gameId)
                                  .map(game -> new GameDto(game))
                                  .orElse(null);
    }

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public GameDto getRandomGame() {
        List<GameDto> games = getGames();
        if (games.isEmpty()) { throw new IllegalStateException("no games available"); }
        Random random = new Random();
        return games.get(random.nextInt(games.size()));
    }

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public List<GameDto> getGamesByLevel(String level) {
        if (level == null) {
            throw new IllegalArgumentException("invalid game level");
        }
        
        if (level.equalsIgnoreCase("Easy")) { level = "Easy"; }
        else if (level.equalsIgnoreCase("Medium")) { level = "Medium"; }
        else if (level.equalsIgnoreCase("Hard")) { level = "Hard"; }
        else { throw new IllegalArgumentException("invalid game level"); }
        
        return gameRepository.getGamesByLevel(level)
                                  .stream()
                                  .map(game -> new GameDto(game))
                                  .toList();
    }
}