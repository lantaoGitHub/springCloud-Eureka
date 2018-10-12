package com.eureka.client.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lantao [lantao@suixingpay.com]
 * @Title: RestTemplateConfig
 * @ProjectName springCloud-eureka
 * @date 2018/9/27 11:40
 * @Description: TODO
 */
@Configuration
public class RestTemplateConfig {

    @Bean(value = "restTemplate1")
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean(value = "restTemplate2")
    @LoadBalanced
    public RestTemplate restTemplate2(){
        return new RestTemplate();
    }

    @Bean(value = "restTemplate3")
    public RestTemplate restTemplate3(){
        return new RestTemplate();
    }
}
