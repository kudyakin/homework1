package com.kudiukin.homework1.service;

public interface QuizService {

    void quiz();

    boolean checkAnswer(String answer);

    String askQuestion();
}
