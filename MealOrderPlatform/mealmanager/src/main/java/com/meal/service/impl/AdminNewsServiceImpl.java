package com.meal.service.impl;

import com.meal.mapper.AdminNewsMapper;
import com.meal.pojo.AdminNews;
import com.meal.pojo.AdminNewsExample;
import com.meal.service.AdminNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author 汪培林

@create 2018-11-10-12:54
*/
@Service
public class AdminNewsServiceImpl implements AdminNewsService {

    @Autowired
    private AdminNewsMapper adminNewsMapper;

    public List<AdminNews> getAdminNews() {

        AdminNewsExample example=new AdminNewsExample();
        List<AdminNews> news=adminNewsMapper.selectByExample(example);
        if(news==null||news.isEmpty()) return null;

        return news;
    }
}
