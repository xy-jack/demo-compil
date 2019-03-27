package com.yd.controller;

import com.yd.entity.UserEntity;
import com.yd.service.User1Service;
import com.yd.utils.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private User1Service user1Service;

    @GetMapping("/getUsers")
    public List<UserEntity> getUsers() {
        List<UserEntity> users = user1Service.getUsers();
        return users;
    }

    /**
     * 测试插入
     * @param userEntity
     * @return
     */
    @PostMapping
    public Integer insertTransactional(@RequestBody UserEntity userEntity) {
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        // 生成唯一主键
        userEntity.setId(idWorker.nextId());
        userEntity.setOrderId(idWorker.nextId());
        int i = user1Service.updateTransactional(userEntity);
        return i;
    }
}
