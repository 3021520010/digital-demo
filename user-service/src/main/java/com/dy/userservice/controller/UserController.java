package com.dy.userservice.controller;

import com.dy.userservice.entity.Users;
import com.dy.userservice.service.IUSerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUSerService userService;
    @PostMapping("/register")
    public void register(@RequestBody Users users){
        userService.register(users);
    }
}
