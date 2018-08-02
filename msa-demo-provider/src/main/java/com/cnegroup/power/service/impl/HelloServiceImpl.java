package com.cnegroup.power.service.impl;

import com.cnegroup.power.sevice.HelloService;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by zhaoyuehai 2018/7/20
 */
@Slf4j
public class HelloServiceImpl implements HelloService {


    public void sayHello() {
        log.debug("hello.....hello");

    }

    public String getSay() {
        return "hello---hello";
    }
}
