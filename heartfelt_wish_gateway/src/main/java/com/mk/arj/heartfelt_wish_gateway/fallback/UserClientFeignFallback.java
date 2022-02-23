package com.mk.arj.heartfelt_wish_gateway.fallback;

import com.mk.arj.heartfelt_wish_gateway.fegin.UserClientFeign;
import org.springframework.stereotype.Component;

@Component
public class UserClientFeignFallback implements UserClientFeign {
    @Override
    public String QueryUserById(String userId) {
        return "没事儿~";
    }
}
