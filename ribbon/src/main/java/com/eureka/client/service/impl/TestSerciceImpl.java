package com.eureka.client.service.impl;

import com.eureka.client.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author lantao [lantao@suixingpay.com]
 * @Title: TestSerciceImpl
 * @ProjectName springCloud-eureka
 * @date 2018/9/27 11:25
 * @Description: TODO
 */
@Service
public class TestSerciceImpl implements TestService {

    @Autowired
    @Qualifier(value = "restTemplate1")
    private RestTemplate restTemplate;

    @Override
    public Object getUser(String name) {
        return restTemplate.getForObject("http://CLIENT/appService/getUser?name=" + name, String.class);
    }
}
