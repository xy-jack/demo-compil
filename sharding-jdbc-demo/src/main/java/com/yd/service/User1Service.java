package com.yd.service;

import com.yd.dao.User1Dao;
import com.yd.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * TODO
 *
 * @data: 2018/8/16
 * @author: YD
 */
public interface User1Service {

    List<UserEntity> getUsers();

    int updateTransactional(UserEntity user);
}
