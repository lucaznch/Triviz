package com.github.lucaznch.triviz;

import com.github.lucaznch.triviz.game.domain.Game;
import com.github.lucaznch.triviz.game.repository.GameRepository;
import com.github.lucaznch.triviz.question.domain.Question;
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
                Question q1 = new Question();
                q1.setQuestion("What is the last name of Hermione?");
                q1.setAnswer("Granger");
                q1.setCategory("Movies");
                q1.setLevel("Easy");
                Question q2 = new Question();
                q2.setQuestion("How many books are there in the Harry Potter series?");
                q2.setAnswer("7");
                q2.setCategory("Movies");
                q2.setLevel("Medium");
                Question q3 = new Question();
                q3.setQuestion("What is the time complexity of binary search?");
                q3.setAnswer("O(log n)");
                q3.setCategory("Sciences");
                q3.setLevel("Hard");
                Question q4 = new Question();
                q4.setQuestion("What is the time complexity of bubble sort?");
                q4.setAnswer("O(n^2)");
                q4.setCategory("Sciences");
                q4.setLevel("Hard");
                Game game1 = new Game();
                game1.setName("Harry Potter Trivia");
                game1.setCategory("Movies");
                game1.setLevel("Easy");
                game1.getQuestions().add(q1);
                game1.getQuestions().add(q2);
                Game game2 = new Game();
                game2.setName("Computer Science Quiz");
                game2.setCategory("Sciences");
                game2.setLevel("Hard");
                game2.getQuestions().add(q3);
                game2.getQuestions().add(q4);
                Game game3 = new Game();
                game3.setName("General Knowledge Quiz");
                game3.setCategory("Mix");
                game3.setLevel("Medium");
                game3.getQuestions().add(q1);
                game3.getQuestions().add(q2);
                game3.getQuestions().add(q3);
                game3.getQuestions().add(q4);
                questionRepository.saveAll(List.of(q1, q2, q3, q4));
                gameRepository.saveAll(List.of(game1, game2, game3));

                System.out.println("[\u001B[34mdatabase populated\u001B[0m]");
            }
            else {
                System.out.println("[\u001B[34mdatabase already populated\u001B[0m]");
            }
        };
    }
}