package com.example.apiforbruteforce.model;

public class Users {

    private String username;

    private String password;

    private int qtdTentativasLoginIncorreto;

    public Users(String username, String password, int qtdTentativasLoginIncorreto) {
        this.username = username;
        this.password = password;
        this.qtdTentativasLoginIncorreto = qtdTentativasLoginIncorreto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getQtdTentativasLoginIncorreto() {
        return qtdTentativasLoginIncorreto;
    }

    public void setQtdTentativasLoginIncorreto(int qtdTentativasLoginIncorreto) {
        this.qtdTentativasLoginIncorreto = qtdTentativasLoginIncorreto;
    }
}
