package com.mk.arj.heartfelt_wish_biz.controller;

import com.mk.arj.heartfelt_wish_biz.fegin.UserClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/biz")
public class GateWayController {

    @Autowired
    private UserClientFeign userClientFeign;

    @RequestMapping("/query/id")
    public String queryUser(String id){
        return userClientFeign.QueryUserById(id);
    }

}
