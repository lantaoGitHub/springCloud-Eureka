package com.eureka.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lantao [lantao@suixingpay.com]
 * @Title: TestService
 * @ProjectName springCloud-eureka
 * @date 2018/9/27 11:25
 * @Description: TODO
 */
@FeignClient(value = "CLIENT")
public interface TestService {

    @RequestMapping(value = "/appService/getUser", method = RequestMethod.GET)
    String getUser(@RequestParam(value = "name") String name);
}
