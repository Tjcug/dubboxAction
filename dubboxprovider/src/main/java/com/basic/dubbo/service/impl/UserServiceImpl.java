package com.basic.dubbo.service.impl;

import com.basic.dubbo.model.User;
import com.basic.dubbo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * locate com.basic.dubbo.service
 * Created by mastertj on 2018/3/28.
 */

//这里是Spring的注解
@Service("userService")
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = UserService.class ,protocol = {"rest","dubbo"} ,retries = 0)
public class UserServiceImpl implements UserService {

    public void testget() {
        System.out.println("测试。。。。get请求");
    }

    public User getUser() {
        User user =new User();
        user.setId("10001");
        user.setName("tanjie");
        return user;
    }

    public User getUser( Integer id) {
        System.out.println("id："+id);
        System.out.println("测试。。。。get请求");
        User user =new User();
        user.setId("10001");
        user.setName("tanjie");
        return user;
    }

    public User getUser(Integer id, String name) {
        System.out.println("id："+id+" name："+name);
        System.out.println("测试。。。。get请求");
        User user =new User();
        user.setId(String.valueOf(id));
        user.setName(name);
        return user;
    }

    public void testPost() {
        System.out.println("测试。。。。post请求");
    }

    public User postUser(User user) {
        System.out.println("name："+user.getName()+" id："+user.getId());
        System.out.println("测试。。。。post请求");
        User user1 =new User();
        user1.setId("10001");
        user1.setName("tanjie");
        return user1;
    }

    public User postUser( String id) {
        System.out.println("id："+id);
        System.out.println("测试。。。。post请求");
        User user1 =new User();
        user1.setId("10001");
        user1.setName("tanjie");
        return user1;
    }
}
