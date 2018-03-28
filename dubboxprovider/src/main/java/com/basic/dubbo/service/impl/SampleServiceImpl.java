package com.basic.dubbo.service.impl;

import com.basic.dubbo.model.Sample;
import com.basic.dubbo.service.SampleService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * locate com.basic.dubbo.service
 * Created by mastertj on 2018/3/28.
 */
@Service("sampleService")
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = SampleService.class, protocol = "dubbo",retries = 0)
public class SampleServiceImpl implements SampleService {
    public String sayHello(String name) {
        return "hello~~ "+name;
    }

    public Sample getSample() {
        Sample sample=new Sample();
        sample.setAge(28);
        sample.setName("tanjie");
        HashMap<String,Integer> hashMap=new HashMap<String, Integer>();
        hashMap.put("liuchong",23);
        hashMap.put("tanjie",22);
        sample.setMap(hashMap);
        return sample;
    }
}
