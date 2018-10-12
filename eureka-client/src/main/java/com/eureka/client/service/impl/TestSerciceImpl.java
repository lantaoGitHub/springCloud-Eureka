package com.eureka.client.service.impl;

import com.eureka.client.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author lantao [lantao@suixingpay.com]
 * @Title: TestSerciceImpl
 * @ProjectName springCloud-eureka
 * @date 2018/9/27 11:25
 * @Description: TODO
 */
@Service
public class TestSerciceImpl implements TestService {

    @Override
    public Object getUser(String name, String port) {
        return "我是" + name + ",端口是：" + port;
    }
}
