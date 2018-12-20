package com.meal.service.impl;

import com.meal.mapper.ClassifyMapper;
import com.meal.pojo.Classify;
import com.meal.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
@author 汪培林

@create 2018-11-27-18:45
*/
@Service
public class ClassifyServiceImpl implements ClassifyService {

    @Autowired
    private ClassifyMapper classifyMapper;

    public Classify getClassifyById(String id) {
        Classify tag=classifyMapper.selectByPrimaryKey(id);
        if(tag==null) return null;
        return tag;
    }
}
