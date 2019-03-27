package com.yd.dao;

import com.yd.entity.UserEntity;

import java.util.List;

/**
 * TODO
 *
 * @data: 2018/8/16
 * @author: YD
 */
public interface User1Dao {

    /**
     * 获取全部
     * @return
     */
    List<UserEntity> getAll();

    /**
     *  插入
     * @param user
     */
    int insert(UserEntity user);


}
