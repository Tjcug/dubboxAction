package com.basic.dubbo.service;

import com.basic.dubbo.model.Sample;

/**
 * locate com.basic.dubbo.service
 * Created by mastertj on 2018/3/28.
 */
public interface SampleService {
    public String sayHello(String name);

    public Sample getSample();
}
