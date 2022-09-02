package com.kudiukin.homework1;

import com.kudiukin.homework1.service.QuizService;
import com.kudiukin.homework1.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationQuiz {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        UserService userService = context.getBean(UserService.class);
        QuizService quizService = context.getBean(QuizService.class);

        userService.askUserNameAndSurname();

        quizService.quiz();
    }
}
