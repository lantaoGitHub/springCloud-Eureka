package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lantao [lantao@suixingpay.com]
 * @Title: EurekaClientApplication
 * @ProjectName springCloud-eureka
 * @date 2018/9/21 10:19
 * @Description: TODO
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignClientApplication.class, args);
    }
}
