package com.yangs.springbootbegin.controller;

import com.yangs.springbootbegin.bean.User;
import com.yangs.springbootbegin.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@Slf4j
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/user")
    public User findUserById(@RequestParam("id") int id) {
        return userService.findUserById(id);
    }
}
