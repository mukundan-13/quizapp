package com.quizz.quizzapp.controller;

import com.quizz.quizzapp.entity.Score;
import com.quizz.quizzapp.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/scores")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @GetMapping
    public List<Score> getAllScores() {
        return scoreService.getAllScores();
    }

    @PostMapping
    public String saveScore(@RequestBody Score score) {
        scoreService.saveScore(score);
        return "Score saved successfully!";
    }
}
