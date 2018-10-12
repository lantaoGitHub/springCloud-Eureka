package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lantao [lantao@suixingpay.com]
 * @Title: EurekaClientApplication
 * @ProjectName springCloud-eureka
 * @date 2018/9/21 10:19
 * @Description: TODO
 */
@SpringBootApplication
@EnableEurekaClient
public class RibbonClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonClientApplication.class, args);
    }
}
