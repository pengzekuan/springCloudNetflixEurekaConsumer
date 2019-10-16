package com.peter.netflix.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value = "user-center-provider", path = "/user", decode404 = true)
public interface UserFeign {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    String hello();
}
