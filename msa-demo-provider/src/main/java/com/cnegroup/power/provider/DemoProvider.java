package com.cnegroup.power.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by zhaoyuehai 2018/7/20
 */
//@Slf4j
public class DemoProvider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("msa-demo-provider.xml");
//        log.debug("服务准备启动...");
        System.out.print("服务准备启动...");
        applicationContext.start();
//        log.debug("服务已经启动...");
        System.out.print("服务已经启动...");
        System.in.read();
    }
}
