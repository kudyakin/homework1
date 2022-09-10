package com.kudiukin.homework1.service;

import com.kudiukin.homework1.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Getter
@Setter
@Service
public class UserServiceImpl implements UserService {

    private User user;

    public void askUserNameAndSurname() {
        Scanner scanner = new Scanner(System.in);
        boolean isFilled = false;
        while (!isFilled) {
            System.out.println("Введите свое имя:");
            user.setName(scanner.nextLine());
            System.out.println("Введите свою фамилию:");
            user.setSurname(scanner.nextLine());
            if (checkUser()) {
                isFilled = true;
            } else {
                System.out.println("Имя и Фамилия не могут быть незаполненными!");
            }
        }
    }

    public Boolean checkUser() {
        return !user.getName().isEmpty() && !user.getSurname().isEmpty();
        }
}