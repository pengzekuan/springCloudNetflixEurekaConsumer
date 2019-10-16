package com.peter.netflix.consumer.controller;

import com.peter.netflix.consumer.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserFeign userFeign;

    @RequestMapping(value = "/testFeign")
    public String test() {
        String str = userFeign.hello();
        return "test feign:" + str;
    }
}
