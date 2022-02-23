package com.mk.arj.heartfelt_wish_biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.mk.arj"})
@EnableDiscoveryClient
public class HeartfeltWishBizApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(HeartfeltWishBizApplication.class, args);
        /*while (true){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String property = configurableApplicationContext.getEnvironment().getProperty("common.name");
            System.out.println("nacos-config property: " + property);
        }*/
    }

}
