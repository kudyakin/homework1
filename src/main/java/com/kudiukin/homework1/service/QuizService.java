package com.kudiukin.homework1.service;

import com.kudiukin.homework1.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Scanner;

@Getter
@Setter
public class QuizService {
    private FileReader fileReader;
    private User user;
    private int score;
    private int number;

    public void quiz() {
        Scanner scanner = new Scanner(System.in);
        while (number < fileReader.getRecords().size()) {
            System.out.println(askQuestion());
            if (checkAnswer(scanner.nextLine())) {
                score++;
            }
            number++;
        }
        System.out.println("\n" + user.getName() + " " + user.getSurname() + "\n"
                + "Набранные баллы: " + score + "/" + fileReader.getRecords().size());
    }

    private boolean checkAnswer(String answer) {
        return fileReader.getRecords().get(number).get(5).equals(answer);
    }

    private String askQuestion() {
        List<String> record = fileReader.getRecords().get(number);
        return record.get(0) + " Варианты ответов: " + String.join(
                ", ", record.get(1), record.get(2), record.get(3), record.get(4));
    }

}