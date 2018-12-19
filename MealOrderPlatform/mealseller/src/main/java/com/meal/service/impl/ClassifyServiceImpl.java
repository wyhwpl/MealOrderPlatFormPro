package com.meal.service.impl;

import com.meal.mapper.ClassifyMapper;
import com.meal.pojo.Classify;
import com.meal.pojo.ClassifyExample;
import com.meal.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author 汪培林

@create 2018-12-03-13:27
*/
@Service
public class ClassifyServiceImpl implements ClassifyService {

    @Autowired
    private ClassifyMapper classifyMapper;


    public List<Classify> getAllClassify(int sellerId) {

        ClassifyExample example=new ClassifyExample();

        ClassifyExample.Criteria criteria=example.createCriteria();

        criteria.andSelleridEqualTo(sellerId);

        List<Classify> classifies=classifyMapper.selectByExample(example);

        if(classifies==null||classifies.isEmpty()){
            return null;
        }

        return classifies;
    }

    public Classify getClassifyById(int tagId) {

        return classifyMapper.selectByPrimaryKey(tagId);
    }

    public int addTag(Classify classify, int sellerId) {

        classify.setSellerid(sellerId);

        return classifyMapper.insert(classify);
    }

    public int modifyTag(int tagId, String tagName) {

        Classify classify=classifyMapper.selectByPrimaryKey(tagId);
        classify.setClassifytag(tagName);

        return classifyMapper.updateByPrimaryKey(classify);
    }
}
