package com.meal.service.impl;

import com.meal.commons.CheckResult;
import com.meal.commons.CreateUUID;
import com.meal.mapper.AdminMapper;
import com.meal.mapper.AdminNewsMapper;
import com.meal.mapper.AdminTasksMapper;
import com.meal.mapper.RiderMapper;
import com.meal.pojo.*;
import com.meal.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Random;

/*
@author 汪培林

@create 2018-12-12-18:55
*/
@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RiderMapper riderMapper;

    @Autowired
    private AdminTasksMapper adminTasksMapper;

    @Autowired
    private AdminNewsMapper adminNewsMapper;

    @Autowired
    private AdminMapper adminMapper;


    public CheckResult checkData(String param, int type) {

        RiderExample example = new RiderExample();
        RiderExample.Criteria criteria=example.createCriteria();
        //type=1 代表手机号
        if(type==1){
            criteria.andPhoneEqualTo(param);
        }
        List<Rider> riders=riderMapper.selectByExample(example);
        if(riders==null||riders.isEmpty()){
            return CheckResult.ok(true);
        }
        return CheckResult.ok(false);
    }

    public CheckResult register(Rider rider) {

        if(StringUtils.isEmpty(rider.getPhone())||
                StringUtils.isEmpty(rider.getPassword())){
            return CheckResult.build(400,"登录账号或者密码为空");
        }
        if(StringUtils.isEmpty(rider.getUsername())){
            return CheckResult.build(400,"用户名为空");
        }

        CheckResult checkResult=checkData(rider.getPhone(),1);
        if(checkResult.getStatus()==500){
            return CheckResult.build(500,"登录账号已存在");
        }
        String id= CreateUUID.createUUID();
        Date time=new Date();
        rider.setId(id);
        rider.setRegtime(time);
        rider.setStatus(0);
        rider.setPassword(DigestUtils.md5DigestAsHex(rider.getPassword().getBytes()));
        rider.setScore(0f);
        riderMapper.insert(rider);

        AdminExample example=new AdminExample();
        int count=adminMapper.countByExample(example);
        List<Admin> admins=adminMapper.selectByExample(example);
        AdminTasks tasks=new AdminTasks();
        tasks.setId(CreateUUID.createUUID());
        tasks.setTaskkind(2);
        tasks.setObjectid(id);
        tasks.setUsername(rider.getUsername());
        tasks.setStatus(0);
        tasks.setTasktime(time);
        Random random=new Random();
        int s=random.nextInt(count)%(count-1+1)+1;
        String adminId=admins.get(s).getId();
        System.out.println(adminId);
        tasks.setAdminid(adminId);
        adminTasksMapper.insert(tasks);
        AdminNews news=new AdminNews();
        news.setId(CreateUUID.createUUID());
        news.setUserkind(3);
        news.setUserid(id);
        news.setUsername(rider.getUsername());
        news.setAction("申请注册");
        news.setActionobject("骑手");
        news.setNewstime(time);
        adminNewsMapper.insert(news);

        return CheckResult.build(200,"注册成功");
    }
}
