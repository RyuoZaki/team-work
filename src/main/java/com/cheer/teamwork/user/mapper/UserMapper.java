package com.cheer.teamwork.user.mapper;

import com.cheer.teamwork.user.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int insert(User user);
    int countUser(@Param("userName")String userName,@Param("password")String password);
    int update(User user);
}
