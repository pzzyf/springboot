package afe1.controller;

import afe1.service.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //解释这是项目的接口
@RequestMapping("/user")
public class UserController {
    @GetMapping("/start")
    public String start() {
        return "启动";
    }

    @GetMapping
    public User getUser(){
        return new User("afe1","男",18,"17325672494");
    }
}
