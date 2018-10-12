package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lantao [lantao@suixingpay.com]
 * @Title: Application
 * @ProjectName springCloud-eureka
 * @date 2018/9/18 18:24
 * @Description: TODO
 */
@SpringBootApplication
@EnableEurekaServer
public class EurakaServer1Application {

    public static void main(String[] args) {
        new SpringApplication().run(EurakaServer1Application.class, args);
    }
}
