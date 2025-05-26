package com.github.lucaznch.triviz;

import com.github.lucaznch.triviz.game.domain.Game;
import com.github.lucaznch.triviz.game.repository.GameRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TrivizApplication {
    public static void main(String[] args) {
        SpringApplication.run(TrivizApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(GameRepository gameRepository) {
        return args -> {
            if (gameRepository.count() == 0) {
                Game game1 = new Game();
                game1.setName("Harry Potter Trivia");
                game1.setCategory("Books and Movies");
                game1.setLevel("Easy");
                gameRepository.save(game1);

                Game game2 = new Game();
                game2.setName("Biology Quiz");
                game2.setCategory("Sciences");
                game2.setLevel("Medium");
                gameRepository.save(game2);

                Game game3 = new Game();
                game3.setName("Trignometry Challenge");
                game3.setCategory("Mathematics");
                game3.setLevel("Hard");
                gameRepository.save(game3);

                System.out.println("sample games created and inserted into the database");
            }
        };
    }
}

