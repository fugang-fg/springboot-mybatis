package com.atguigu.controller;

import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;  //JDK动态代理

    @GetMapping("/user/findAll")
    public List<User> findAll(){

        //userService.getClass() = class com.sun.proxy.$Proxy68
        System.out.println("userService.getClass() = " + userService.getClass());

        return userService.findAll();
    }
}
