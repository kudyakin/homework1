package com.kudiukin.homework1;

import com.kudiukin.homework1.service.QuizServiceImpl;
import com.kudiukin.homework1.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationQuiz {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        UserServiceImpl userService = context.getBean(UserServiceImpl.class);
        QuizServiceImpl quizService = context.getBean(QuizServiceImpl.class);

        userService.askUserNameAndSurname();

        quizService.quiz();
    }
}