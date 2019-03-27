package com.yd.service.impl;

import com.yd.dao.User1Dao;
import com.yd.entity.UserEntity;
import com.yd.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @data: 2018/8/16
 * @author: YD
 */
@Service
public class User1ServiceImpl implements User1Service {
    @Autowired
    private User1Dao user1Dao;

    @Override
    public List<UserEntity> getUsers() {
        List<UserEntity> users = user1Dao.getAll();
        return users;
    }

    @Override
    // @Transactional(value="test1TransactionManager",rollbackFor = Exception.class,timeout=36000)  //说明针对Exception异常也进行回滚，如果不标注，则Spring 默认只有抛出 RuntimeException才会回滚事务
    public int updateTransactional(UserEntity user) {
        try{
            int num = user1Dao.insert(user);
            return num;
        }catch(Exception e){
            // 事物方法中，如果使用trycatch捕获异常后，需要将异常抛出，否则事物不回滚。
            throw e;
        }
    }

}
