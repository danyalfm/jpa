package com.uabc.database.example.examplejpa.jpa.model;

import lombok.Data;

@Data
public class UserRoleModel {
    private int userRoleId;
    private String user;
    private String role;

    public UserRoleModel(){

    }
}
