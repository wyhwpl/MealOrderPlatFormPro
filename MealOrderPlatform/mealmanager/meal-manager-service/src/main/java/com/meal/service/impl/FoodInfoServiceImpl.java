package com.meal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meal.mapper.FoodMapper;
import com.meal.pojo.Food;
import com.meal.pojo.FoodExample;
import com.meal.service.FoodInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author 汪培林

@create 2018-11-01-17:57
*/
@Service
public class FoodInfoServiceImpl implements FoodInfoService {

    @Autowired
    private FoodMapper foodMapper;

    public PageInfo getFoodInfoByType(int type, int pageNum, int pageSize) {

        PageHelper.startPage(pageNum, pageSize);
        FoodExample example=new FoodExample();
        FoodExample.Criteria criteria=example.createCriteria();
        //type=1、2、3、4分别代表已审核、未审核、未通过审核、通过审核
        if(type==1){
            criteria.andIsauditEqualTo(1);
        }
        if(type==2){
            criteria.andIsauditEqualTo(0);
        }
        if(type==3){
            criteria.andIsauditEqualTo(1);
            criteria.andIsthoughEqualTo(0);
        }
        if(type==4){
            criteria.andIsauditEqualTo(1);
            criteria.andIsthoughEqualTo(1);
        }
        List<Food> foods=foodMapper.selectByExample(example);
        if(foods==null||foods.isEmpty())return null;
        PageInfo pageInfo=new PageInfo(foods);

        return pageInfo;
    }
}
