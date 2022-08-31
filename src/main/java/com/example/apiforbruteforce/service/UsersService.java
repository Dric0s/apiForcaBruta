package com.example.apiforbruteforce.service;

import com.example.apiforbruteforce.model.Users;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    Users userDataBase = new Users("admin", "012379", 0);
    public boolean login(Users user) {
        if(userDataBase.getQtdTentativasLoginIncorreto() <= 15) {
            if(userDataBase.getUsername().equals(user.getUsername()) && userDataBase.getPassword().equals(user.getPassword())) {
                System.out.println("Senha correta: " + user.getPassword());
                userDataBase.setQtdTentativasLoginIncorreto(0);
                return true;
            }
            System.out.println("Senha incorreta!");
            if(userDataBase.getQtdTentativasLoginIncorreto() == 15) {
                System.out.println("Quantidade de tentativas de login inválidas ultrapassadas: " + userDataBase.getQtdTentativasLoginIncorreto());
            }
                userDataBase.setQtdTentativasLoginIncorreto(userDataBase.getQtdTentativasLoginIncorreto() + 1);
        }

        return false;

    }
}
