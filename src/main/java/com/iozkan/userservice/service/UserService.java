package com.iozkan.userservice.service;

import com.iozkan.userservice.domain.Role;
import com.iozkan.userservice.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    User getUser(String username);
    List<User> getUsers();
}
