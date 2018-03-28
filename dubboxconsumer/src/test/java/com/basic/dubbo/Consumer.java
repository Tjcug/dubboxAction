package com.basic.dubbo;

import com.basic.dubbo.model.Sample;
import com.basic.dubbo.service.SampleService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * locate com.basic.dubbo
 * Created by mastertj on 2018/3/28.
 */
public class Consumer {
    @Test
    public void test() throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"dubbo-consumer.xml"});
        SampleService sampleService= (SampleService) context.getBean("sampleService");
        String tanjie = sampleService.sayHello("tanjie");
        System.out.println(tanjie);

        Sample sample = sampleService.getSample();
        System.out.println(sample);
        context.start();
        System.in.read();       //保证服务一直打开
    }
}
