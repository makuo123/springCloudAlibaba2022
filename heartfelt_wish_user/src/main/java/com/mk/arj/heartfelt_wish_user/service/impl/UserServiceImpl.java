package com.mk.arj.heartfelt_wish_user.service.impl;

import com.mk.arj.heartfelt_wish_user.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String QueryUserById(String userId) {
        return "123";
    }
}
