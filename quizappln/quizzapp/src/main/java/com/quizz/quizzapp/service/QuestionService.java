package com.quizz.quizzapp.service;

import com.quizz.quizzapp.entity.Question;
import com.quizz.quizzapp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getQuestionsByCategory(String category) {
        return questionRepository.findByCategory(category);
    }

    public void addQuestion(Question question) {
        questionRepository.save(question);
    }
}
