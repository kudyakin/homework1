package com.kudiukin.homework1.service;

import com.kudiukin.homework1.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Getter
@Setter
public class UserService {

    private User user;

    public void askUserNameAndSurname() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свое имя:");
        user.setName(scanner.nextLine());
        System.out.println("Введите свою фамилию:");
        user.setSurname(scanner.nextLine());
        checkUser();
    }

        private void checkUser() {
            if (user.getName().isEmpty() || user.getSurname().isEmpty()) {
                throw new IllegalArgumentException("ВВедите имя и фамилию пользователя и попробуйте снова");
            }
        }

}