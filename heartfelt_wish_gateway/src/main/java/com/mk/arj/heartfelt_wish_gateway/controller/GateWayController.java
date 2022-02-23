package com.mk.arj.heartfelt_wish_gateway.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.mk.arj.heartfelt_wish_gateway.fegin.UserClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class GateWayController {

    @RequestMapping(value = "test")
    @SentinelResource(value = "fallback",fallback = "handlerFallback",blockHandler = "blockHandler")
    public String test(String a){
        if (!StringUtils.hasText(a)){
            throw new IllegalArgumentException("a is empty");
        }

        return "success";
    }

    @Resource
    private UserClientFeign userClientFeign;

    @RequestMapping("/query/id")
    public String queryUser(String id){
        return userClientFeign.QueryUserById(id);
    }

    /**
     * 本例是fallback
     */
    public static String handlerFallback(String a, Throwable e) {
        return  "兜底异常handlerFallback,exception内容 ";
    }

    /**
     * 本例是blockHandler
     */
    public static String blockHandler(String a, BlockException blockException) {
        return  "blockHandler-sentinel限流,无此流水: blockException  ";
    }
}
