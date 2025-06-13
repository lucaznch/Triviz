package com.github.lucaznch.triviz.game.repository;

import com.github.lucaznch.triviz.game.domain.Game;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface GameRepository extends JpaRepository<Game, Integer> {
    @Query("SELECT g FROM Game g WHERE g.level = ?1")
    List<Game> getGamesByLevel(String level);
}

