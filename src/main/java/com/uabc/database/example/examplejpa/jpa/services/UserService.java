package com.uabc.database.example.examplejpa.jpa.services;

import com.uabc.database.example.examplejpa.jpa.entity.User;
import com.uabc.database.example.examplejpa.jpa.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public interface UserService {
    public abstract UserModel addUser(UserModel userModel);

    public abstract List<UserModel> listAllUsers();

    public abstract User findUserByUsername(String username);

    public abstract void removeUser(String username);

    public abstract UserModel findUserByUsernameModel(String username);
}
