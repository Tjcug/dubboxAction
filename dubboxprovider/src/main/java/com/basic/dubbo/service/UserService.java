package com.basic.dubbo.service;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.basic.dubbo.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * locate com.basic.dubbo.service
 * Created by mastertj on 2018/3/28.
 */
@Path("/userService")
//提供者接受消费者的格式
@Consumes({MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
//提供者返回给消费者的格式
@Produces({ContentType.APPLICATION_JSON_UTF_8,ContentType.TEXT_XML_UTF_8})
public interface UserService {
    /**
     * 测试get请求
     * http://localhost:8888/provider/userService/testget
     */
    @GET
    @Path("/testget")
    public void testget();

    /**
     * getUser获取User信息
     * http://localhost:8888/provider/userService/getUser
     */
    @GET
    @Path("/getUser")
    public User getUser();

    /**
     * 根据ID getUser获取User信息
     * http://localhost:8888/provider/userService/get/1111
     * @param id
     * @return
     */
    @GET
    @Path("/get/{id : \\d+}")
    public User getUser(@PathParam(value ="id") Integer id);

    /**
     * 根据ID和name getUser获取User信息
     * http://localhost:8888/provider/userService/get/1/a1
     * @param id
     * @return
     */
    @GET
    @Path("/get/{id : \\d+}/{name : [a-zA-Z][0-9]}")
    public User getUser(@PathParam(value ="id") Integer id,@PathParam(value ="name") String name);

    /**
     * 提交Post请求
     * http://localhost:8888/provider/userService/testpost
     * @return
     */
    @POST
    @Path("/testpost")
    public void testPost();

    /**
     * 提交Post请求 比如update User
     * http://localhost:8888/provider/userService/postUser
     * @return
     */
    @POST
    @Path("/postUser")
    public User postUser(User user);

    /**
     * 提交Post请求 提交id
     * http://localhost:8888/provider/userService/post/1111
     * @return
     */
    @POST
    @Path("/post/{id : \\d+}")
    public User postUser(@PathParam(value ="id") String id);
}
