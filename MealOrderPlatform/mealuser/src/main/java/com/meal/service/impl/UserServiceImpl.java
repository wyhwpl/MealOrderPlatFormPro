package com.meal.service.impl;

import com.meal.commons.CheckResult;
import com.meal.mapper.UserMapper;
import com.meal.pojo.User;
import com.meal.pojo.UserExample;
import com.meal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/*
@author 汪培林

@create 2018-12-15-15:03
*/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    public CheckResult loginCheck(HttpServletRequest request, HttpServletResponse response, User user) {
        UserExample example=new UserExample();
        UserExample.Criteria criteria=example.createCriteria();
        criteria.andPhoneEqualTo(user.getPhone());
        criteria.andPasswordEqualTo(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
        List<User> users=userMapper.selectByExample(example);
        if(users==null||users.isEmpty()){
            return CheckResult.build(400,"账号或密码错误");
        }
        User userSession=users.get(0);
        userSession.setPassword(user.getPassword());
        request.getSession().setAttribute("user",userSession);
        return CheckResult.build(200,"登录成功");
    }

    public int logOff(int userId) {


        return userMapper.deleteByPrimaryKey(userId);
    }
}
