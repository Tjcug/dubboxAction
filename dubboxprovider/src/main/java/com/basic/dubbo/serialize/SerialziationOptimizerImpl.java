package com.basic.dubbo.serialize;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import com.basic.dubbo.model.Sample;
import com.basic.dubbo.model.User;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * locate com.basic.dubbo.serialize
 * Created by mastertj on 2018/3/28.
 */
public class SerialziationOptimizerImpl implements SerializationOptimizer{
    @Override
    public Collection<Class> getSerializableClasses() {
        List<Class> classes=new LinkedList<>();
        classes.add(Sample.class);
        classes.add(User.class);
        return classes;
    }
}
