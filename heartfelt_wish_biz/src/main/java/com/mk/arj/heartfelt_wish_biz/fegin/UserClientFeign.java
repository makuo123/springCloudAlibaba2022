package com.mk.arj.heartfelt_wish_biz.fegin;

import com.mk.arj.heartfelt_wish_biz.fallback.UserClientFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "heartfelt-wish-user", fallback = UserClientFeignFallback.class)
public interface UserClientFeign {

    @RequestMapping("user/query/id")
    String QueryUserById(String userId);
}
