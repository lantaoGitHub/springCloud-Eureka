package com.eureka.client.controller;

import com.eureka.client.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lantao [lantao@suixingpay.com]
 * @Title: testContorller
 * @ProjectName springCloud-eureka
 * @date 2018/9/27 11:22
 * @Description: TODO
 */
@RestController
@RequestMapping("/appService")
public class TestContorller {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public Object getUser(@RequestParam String name) {
        return testService.getUser(name);
    }
}
