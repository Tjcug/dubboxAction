package com.basic.dubbo.service;

import com.basic.dubbo.model.User;

/**
 * locate com.basic.dubbo.service
 * Created by mastertj on 2018/3/28.
 */
public interface UserService {
    public void testget();

    public User getUser();

    public User getUser(Integer id);

    public User getUser(Integer id, String name);

    public void testPost();

    public User postUser(User user);

    public User postUser(String id);
}
