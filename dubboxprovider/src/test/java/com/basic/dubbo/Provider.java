package com.basic.dubbo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * locate com.basic.dubbo
 * Created by mastertj on 2018/3/28.
 */
public class Provider {
    @Test
    public void test() throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
        context.start();
        System.in.read();       //保证服务一直打开
    }
}
