package com.cnegroup.power.consumer;

import com.cnegroup.power.sevice.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaoyuehai 2018/7/20
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("msa-demo-consumer.xml");
        applicationContext.start();
        System.out.println("消费一下...");
        HelloService bean = applicationContext.getBean(HelloService.class);
        bean.sayHello();
        System.out.println("消费...:" + bean.getSay());
        applicationContext.stop();
    }
}
