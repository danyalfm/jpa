package com.uabc.database.example.examplejpa.jpa.model;

import com.uabc.database.example.examplejpa.jpa.entity.UserRole;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class UserModel {
    private String username;
    private String password;
    private boolean enabled;
    private Set<UserRole> userRoles = new HashSet<UserRole>();

    public UserModel(){}
}
