package com.github.lucaznch.triviz.question;

import com.github.lucaznch.triviz.question.dto.QuestionDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/level/{level}")
    public List<QuestionDto> getQuestionsByLevel(@PathVariable String level) {
        return questionService.getQuestionsByLevel(level);
    }
}