package com.yd.swagger.controller;


import com.yd.swagger.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/*
    @Api：修饰整个类，描述Controller的作用
    @ApiOperation：描述一个类的一个方法，或者说一个接口
    @ApiParam：单个参数描述
    @ApiModel：用对象来接收参数
    @ApiProperty：用对象接收参数时，描述对象的一个字段
    @ApiResponse：HTTP响应其中1个描述
    @ApiResponses：HTTP响应整体描述
    @ApiIgnore：使用该注解忽略这个API
    @ApiError ：发生错误返回的信息
    @ApiImplicitParam：一个请求参数
    @ApiImplicitParams：多个请求参数
 */
@RestController
public class UserController {


    @GetMapping("getUser")
    @ApiOperation(value = "获取用户列表", notes = "获取用户列表")
    //@ApiImplicitParam(name = "id", value = "学生ID", paramType = "path", required = true, dataType = "Integer")
    public List<User> list() {
        ArrayList<User> userList = new ArrayList<>();
        User user1 = new User();
        User user2 = new User();
        user1.setName("张三");
        user1.setAge(21);

        user2.setName("李四");
        user2.setAge(23);

        userList.add(user1);
        userList.add(user2);
        return userList;
    }

    @PostMapping("addUser")
    @ApiOperation(value = "创建用户", notes = "根据用户对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    public String add(User user) {
        return "添加成功";
    }

}
