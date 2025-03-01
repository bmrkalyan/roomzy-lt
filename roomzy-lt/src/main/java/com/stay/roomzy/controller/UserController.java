package com.stay.roomzy.controller;

import com.stay.roomzy.dto.User;
import com.stay.roomzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        return service.verify(user);
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.register(user);

    }
}
