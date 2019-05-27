package com.cheer.teamwork.user.service.impl;

import com.cheer.teamwork.user.mapper.UserMapper;
import com.cheer.teamwork.user.model.User;
import com.cheer.teamwork.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void insert(User user){
        userMapper.insert(user);
    }
    @Override
    public boolean verifyLogin(String userName,String password){
        int  result = userMapper.countUser(userName,password);
        if(result == 1){
            return true;
        }
        return false;
    }
    @Override
    public void update(User user){
        userMapper.update(user);
    }
}
