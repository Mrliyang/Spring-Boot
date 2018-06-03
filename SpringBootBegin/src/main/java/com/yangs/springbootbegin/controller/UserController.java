package com.yangs.springbootbegin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String sayHello() {
        return "hello";
    }
}
