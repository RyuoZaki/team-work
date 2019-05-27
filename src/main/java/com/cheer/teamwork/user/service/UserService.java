package com.cheer.teamwork.user.service;

import com.cheer.teamwork.user.model.User;

public interface UserService {
    void insert(User user);
    boolean verifyLogin(String userName,String password);
    void update(User user);
}
