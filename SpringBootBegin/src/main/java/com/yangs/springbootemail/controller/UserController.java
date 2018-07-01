package com.yangs.springbootemail.controller;

import com.yangs.springbootemail.bean.User;
import com.yangs.springbootemail.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@Slf4j
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("hello")
    public String sayHello() {
        return "hello spring boot";
    }

    @GetMapping("/user")
    public User getUserById(@RequestParam("id") int id) {
        return userService.findUserById(id);
    }

}
