package com.example.apiforbruteforce.controller;

import com.example.apiforbruteforce.model.Users;
import com.example.apiforbruteforce.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsersService usersService;

    @PostMapping()
    public ResponseEntity<Users> login(@RequestBody Users user) {

        if(usersService.login(user)){
            return ResponseEntity.ok(user);}
        else{
            return ResponseEntity.badRequest().build();
        }
    }
}
