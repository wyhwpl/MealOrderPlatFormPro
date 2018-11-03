package com.meal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meal.mapper.UserMapper;
import com.meal.pojo.User;
import com.meal.pojo.UserExample;
import com.meal.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author 汪培林

@create 2018-10-31-12:58
*/
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserMapper userMapper;

    public PageInfo getALLUserInfo(int pageNum, int pageSize) {

        PageHelper.startPage(pageNum, pageSize);
        UserExample example=new UserExample();
        List<User> userList=userMapper.selectByExample(example);
        if(userList==null||userList.isEmpty()){
            return null;
        }

        PageInfo pageInfo=new PageInfo(userList);
        return pageInfo;
    }
}
