package com.quizz.quizzapp.service;

import com.quizz.quizzapp.entity.Score;
import com.quizz.quizzapp.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

    public List<Score> getAllScores() {
        return scoreRepository.findAll();
    }

    public void saveScore(Score score) {
        scoreRepository.save(score);
    }
}
