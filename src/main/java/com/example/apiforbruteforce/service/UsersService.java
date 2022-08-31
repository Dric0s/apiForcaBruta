package com.example.apiforbruteforce.service;

import com.example.apiforbruteforce.model.Users;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    Users userDataBase = new Users("root", "012379", 0);
    
    public boolean login(Users user) {
        
        if(userDataBase.getQtdTentativasLoginIncorreto() <= 15) {
            
            if(userDataBase.getUsername().equals(user.getUsername()) && userDataBase.getPassword().equals(user.getPassword())) {
                userDataBase.setQtdTentativasLoginIncorreto(0);
                return true;
            }
            
            userDataBase.setQtdTentativasLoginIncorreto(userDataBase.getQtdTentativasLoginIncorreto() + 1);
        }

        return false;

    }
}
