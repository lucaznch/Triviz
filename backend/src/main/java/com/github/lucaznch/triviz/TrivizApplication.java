package com.github.lucaznch.triviz;

import com.github.lucaznch.triviz.game.repository.GameRepository;
import com.github.lucaznch.triviz.question.repository.QuestionRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.ArrayList;

@SpringBootApplication
public class TrivizApplication {
    public static void main(String[] args) {
        SpringApplication.run(TrivizApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(GameRepository gameRepository, QuestionRepository questionRepository) {
        return args -> {
            if (gameRepository.count() == 0 && questionRepository.count() == 0) {
                System.out.println("\u001B[34mDATABASE EMPTY\u001B[0m");
            }
            else {
                System.out.println("\u001B[34mDATABASE POPULATED\u001B[0m");
            }
        };
    }
}