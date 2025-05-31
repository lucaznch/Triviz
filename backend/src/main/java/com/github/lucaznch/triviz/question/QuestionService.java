package com.github.lucaznch.triviz.question;

import com.github.lucaznch.triviz.question.dto.QuestionDto;
import com.github.lucaznch.triviz.question.repository.QuestionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Isolation;

import java.util.List;
import java.util.ArrayList;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public List<QuestionDto> getQuestionsByLevel(String level) {
        return questionRepository.getQuestionsByLevel(level)
                                   .stream()
                                   .map(question -> new QuestionDto(question))
                                   .toList();
    }
}