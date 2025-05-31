package com.github.lucaznch.triviz.question.repository;

import com.github.lucaznch.triviz.question.domain.Question;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    @Query("SELECT q FROM Question q WHERE q.level = ?1")
    List<Question> getQuestionsByLevel(String level);
}

