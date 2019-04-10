package com.uabc.database.example.examplejpa.jpa.services;

import com.uabc.database.example.examplejpa.jpa.entity.UserRole;
import com.uabc.database.example.examplejpa.jpa.model.UserRoleModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userRoleService")
public interface UserRoleService {
    public abstract UserRoleModel addUserRole(UserRoleModel userRoleModel);

    public abstract List<UserRoleModel> listAllUserRoles();

    public abstract UserRole findUserRoleById(int id);

    public abstract void removeUserRole(int id);

    public abstract UserRoleModel findUserRoleByIdModel(int id);
}
