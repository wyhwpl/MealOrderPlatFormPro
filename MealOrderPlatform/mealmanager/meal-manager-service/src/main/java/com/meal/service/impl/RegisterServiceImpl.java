package com.meal.service.impl;

import com.meal.commons.CheckResult;
import com.meal.mapper.AdminMapper;
import com.meal.pojo.Admin;
import com.meal.pojo.AdminExample;
import com.meal.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/*
@author 汪培林

@create 2018-10-21-12:37
*/
@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private AdminMapper adminMapper;

    public CheckResult checkData(String param, Integer type) {

        AdminExample example=new AdminExample();
        AdminExample.Criteria criteria=example.createCriteria();
        //1、2分别代表username、loginID
        if(type==1){
            criteria.andUsernameEqualTo(param);
        }
        if(type==2){
            criteria.andLoginidEqualTo(param);
        }
        List<Admin> lists= adminMapper.selectByExample(example);
        if(lists==null||lists.isEmpty()){
            return CheckResult.ok(true);
        }
        else return CheckResult.ok(false);

    }

    public CheckResult register(Admin admin) {
        if(StringUtils.isEmpty(admin.getUsername())){
            return CheckResult.build(400,"用户名为空");
        }
        if(StringUtils.isEmpty(admin.getLoginid())||
                   StringUtils.isEmpty(admin.getPassword())){
            return CheckResult.build(400,"登录账号或密码为空!");
        }
        CheckResult checkResult=checkData(admin.getUsername(),1);
        if(checkResult.getStatus()==500){
            return CheckResult.build(500,"用户名已存在");
        }
        CheckResult checkResult1=checkData(admin.getLoginid(),2);
        if(checkResult1.getStatus()==500){
            return CheckResult.build(500,"登录账号已存在");
        }

        admin.setCreatetime(new Date());
        admin.setPassword(DigestUtils.md5DigestAsHex(admin.getPassword().getBytes()));
        adminMapper.insert(admin);
        return CheckResult.build(200,"注册成功");

    }
}
