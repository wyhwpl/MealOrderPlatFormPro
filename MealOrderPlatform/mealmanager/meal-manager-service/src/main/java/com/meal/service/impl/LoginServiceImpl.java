package com.meal.service.impl;

import com.meal.mapper.AdminMapper;
import com.meal.pojo.Admin;
import com.meal.pojo.AdminExample;
import com.meal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author 汪培林

@create 2018-10-20-19:37
*/
@Service
public class LoginServiceImpl implements LoginService {


    private AdminMapper adminMapper;
    public LoginServiceImpl(){

    }

    @Autowired
    public LoginServiceImpl(AdminMapper adminMapper){
        this.adminMapper=adminMapper;
    }

    public boolean login(String loginID, String password) {

        AdminExample example=new AdminExample();
        AdminExample.Criteria criteria=example.createCriteria();
        criteria.andLoginidEqualTo(loginID);
        criteria.andPasswordEqualTo(password);
        List<Admin> lists=adminMapper.selectByExample(example);

        if(lists==null) return false;
        else return true;
    }
}
