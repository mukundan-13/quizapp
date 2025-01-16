package com.quizz.quizzapp.controller;

import com.quizz.quizzapp.entity.Question;
import com.quizz.quizzapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @PostMapping("/add-with-options")
    public String addQuestionWithOptions(@RequestBody Question question, @RequestBody List<Option> options) {
        questionService.addQuestionWithOptions(question, options);
        return "Question and options added successfully!";
    }

    @GetMapping
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }
}
