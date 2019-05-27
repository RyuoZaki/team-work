package com.cheer.teamwork.user.web.controller;

import com.cheer.teamwork.user.model.User;
import com.cheer.teamwork.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("insert")
    public void insert(@RequestBody User user){
      userService.insert(user);
    }
    @GetMapping("verifyLogin")
    public boolean verifyLogin(@RequestBody String userName,  String password){
       boolean result = userService.verifyLogin(userName,password);
       return result;
    }
    @GetMapping("update")
    public void update(@RequestBody User user){
        userService.update(user);
    }

    

}
