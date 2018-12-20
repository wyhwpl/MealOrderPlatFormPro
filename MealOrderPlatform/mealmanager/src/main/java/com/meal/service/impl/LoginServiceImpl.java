package com.meal.service.impl;

import com.meal.commons.CheckResult;
import com.meal.mapper.AdminMapper;
import com.meal.pojo.Admin;
import com.meal.pojo.AdminExample;
import com.meal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/*
@author 汪培林

@create 2018-10-20-19:37
*/
@Service
public class LoginServiceImpl implements LoginService {


    @Autowired
    private AdminMapper adminMapper;


    public CheckResult loginCheck(HttpServletRequest request, HttpServletResponse response, Admin admin) {

        AdminExample example=new AdminExample();
        AdminExample.Criteria criteria=example.createCriteria();
        criteria.andLoginidEqualTo(admin.getLoginid());
        criteria.andPasswordEqualTo(DigestUtils.md5DigestAsHex(admin.getPassword().getBytes()));
        List<Admin> lists=adminMapper.selectByExample(example);

        if(lists==null||lists.isEmpty()){
            return CheckResult.build(400,"登录账号或密码错误");
        }
        request.getSession().setAttribute("admin",admin);
        Cookie loginId=new Cookie("loginId",admin.getLoginid());
        Cookie password=new Cookie("password",admin.getPassword());
        Cookie imgUrl=new Cookie("imgUrl",lists.get(0).getImgUrl());
        Cookie adminId=new Cookie("adminId",lists.get(0).getId());
        Cookie adminName=null;
        try {
            adminName=new Cookie("adminName", URLEncoder.encode(lists.get(0).getUsername(),"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        response.addCookie(loginId);
        response.addCookie(password);
        response.addCookie(imgUrl);
        response.addCookie(adminName);
        response.addCookie(adminId);

        return CheckResult.build(200,"登陆成功");

    }
}
