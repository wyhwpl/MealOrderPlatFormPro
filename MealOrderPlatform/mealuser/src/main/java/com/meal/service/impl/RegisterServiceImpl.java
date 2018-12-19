package com.meal.service.impl;

import com.meal.commons.CheckResult;
import com.meal.mapper.UserMapper;
import com.meal.pojo.User;
import com.meal.pojo.UserExample;
import com.meal.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import java.util.List;

/*
@author 汪培林

@create 2018-12-14-17:41
*/
@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private UserMapper userMapper;


    public CheckResult checkData(String param, int type) {

        UserExample example=new UserExample();
        UserExample.Criteria criteria=example.createCriteria();
        //type=1、2代表手机号、用户名
        if(type==1){
            criteria.andPhoneEqualTo(param);
        }
        if(type==2){
            criteria.andUsernameEqualTo(param);
        }

        List<User> users=userMapper.selectByExample(example);
        if(users==null||users.isEmpty()){
            return CheckResult.ok(true);
        }


        return CheckResult.ok(false);
    }

    public CheckResult registerHandler(User user) {
        if(StringUtils.isEmpty(user.getPhone())||
                StringUtils.isEmpty(user.getPassword())){
            return CheckResult.build(400,"账号或密码为空");
        }
        if(StringUtils.isEmpty(user.getUsername())){
            return CheckResult.build(400,"用户名为空");
        }

        CheckResult phoneResult=checkData(user.getPhone(),1);
        if(phoneResult.getStatus()==500){
            return CheckResult.build(500,"账号已存在");
        }
        CheckResult userNameResult=checkData(user.getUsername(),2);
        if(userNameResult.getStatus()==500){
            return CheckResult.build(500,"用户名已存在");
        }
        user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
        int result=userMapper.insert(user);
        if(result==0){
            return CheckResult.build(400,"注册失败");
        }
        return CheckResult.build(200,"注册成功");
    }
}
