package com.mk.arj.heartfelt_wish_user.controller;

import com.mk.arj.heartfelt_wish_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("query/id")
    public String QueryUserById(String id){
        System.out.println("进入user的controller");
        return userService.QueryUserById(id);
    }
}
