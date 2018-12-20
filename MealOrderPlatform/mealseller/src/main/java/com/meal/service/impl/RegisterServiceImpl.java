package com.meal.service.impl;

import com.meal.commons.CheckResult;
import com.meal.commons.CreateUUID;
import com.meal.mapper.AdminMapper;
import com.meal.mapper.AdminNewsMapper;
import com.meal.mapper.AdminTasksMapper;
import com.meal.mapper.SellerMapper;
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

@create 2018-10-21-12:37
*/
@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private SellerMapper sellerMapper;

    @Autowired
    private AdminTasksMapper adminTasksMapper;

    @Autowired
    private AdminNewsMapper adminNewsMapper;

    @Autowired
    private AdminMapper adminMapper;

    public CheckResult checkData(String param, Integer type) {

        SellerExample example=new SellerExample();
        SellerExample.Criteria criteria=example.createCriteria();
        //1、2、3分别代表登录账号、身份证件号、手机号
        if(type==1){
            criteria.andLoginidEqualTo(param);
        }
        if(type==2){
            criteria.andIdcardEqualTo(param);
        }
        if(type==3){
            criteria.andPhoneEqualTo(param);
        }
        List<Seller> lists= sellerMapper.selectByExample(example);
        if(lists==null||lists.isEmpty()){
            return CheckResult.ok(true);
        }
        else return CheckResult.ok(false);

    }

    public CheckResult register(Seller seller) {
        if(StringUtils.isEmpty(seller.getLoginid())||
                   StringUtils.isEmpty(seller.getPassword())){
            return CheckResult.build(400,"登录账号或密码为空!");
        }
        if(StringUtils.isEmpty(seller.getSellername())){
            return CheckResult.build(400,"店铺名为空");
        }
        if(StringUtils.isEmpty(seller.getIdcard())){
            return CheckResult.build(400,"身份证件号为空");
        }
        if(StringUtils.isEmpty(seller.getName())){
            return CheckResult.build(400,"商家姓名为空");
        }
        if(StringUtils.isEmpty(seller.getPhone())){
            return CheckResult.build(400,"联系方式为空");
        }
        if(StringUtils.isEmpty(seller.getAddress())){
            return CheckResult.build(400,"商家地址为空");
        }

        CheckResult checkResult1=checkData(seller.getLoginid(),1);
        if(checkResult1.getStatus()==500){
            return CheckResult.build(500,"登录账号已存在");
        }
        CheckResult checkResult2=checkData(seller.getIdcard(),2);
        if(checkResult2.getStatus()==500){
            return CheckResult.build(500,"该身份证号已存在");
        }
        CheckResult checkResult3=checkData(seller.getPhone(),3);
        if(checkResult3.getStatus()==500){
            return CheckResult.build(500,"联系方式已存在");
        }
        String id= CreateUUID.createUUID();
        Date time=new Date();
        seller.setId(id);
        seller.setRegtime(time);
        seller.setStatus(0);
        seller.setScore(0f);
        seller.setPassword(DigestUtils.md5DigestAsHex(seller.getPassword().getBytes()));
        sellerMapper.insert(seller);

        AdminExample example=new AdminExample();
        int count=adminMapper.countByExample(example);
        List<Admin> admins=adminMapper.selectByExample(example);
        AdminTasks tasks=new AdminTasks();
        tasks.setId(CreateUUID.createUUID());
        tasks.setTaskkind(1);
        tasks.setObjectid(id);
        tasks.setUsername(seller.getName());
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
        news.setUserkind(1);
        news.setUserid(id);
        news.setUsername(seller.getName());
        news.setAction("申请注册");
        news.setActionobject("店铺"+seller.getSellername());
        news.setNewstime(time);
        adminNewsMapper.insert(news);

        return CheckResult.build(200,"注册成功");

    }
}
