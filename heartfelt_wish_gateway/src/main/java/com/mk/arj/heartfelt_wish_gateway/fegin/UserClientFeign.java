package com.mk.arj.heartfelt_wish_gateway.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "heartfelt-wish-user")
public interface UserClientFeign {

    @RequestMapping("user/query/id")
    String QueryUserById(String userId);
}
