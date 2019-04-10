package com.uabc.database.example.examplejpa.jpa.services;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
