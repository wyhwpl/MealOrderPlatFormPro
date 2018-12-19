package com.meal.service.impl;

import com.meal.mapper.UserMapper;
import com.meal.pojo.UserExample;
import com.meal.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
@author 汪培林

@create 2018-12-01-18:01
*/
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserMapper userMapper;

    public int getTotal() {

        UserExample example=new UserExample();


        return userMapper.countByExample(example);
    }
}
