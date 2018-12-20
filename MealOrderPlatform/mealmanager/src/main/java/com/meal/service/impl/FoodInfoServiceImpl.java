package com.meal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meal.mapper.FoodMapper;
import com.meal.pojo.Food;
import com.meal.pojo.FoodExample;
import com.meal.service.FoodInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        //type=1、已审核 2、未审核 3、通过审核 4、未通过审核 5、已下架
        if(type==1){
            criteria.andStatusBetween(1,2);
        }
        if(type==2){
            criteria.andStatusEqualTo(0);
        }
        if(type==3){
            criteria.andStatusEqualTo(1);
        }
        if(type==4){
            criteria.andStatusEqualTo(2);
        }
        if(type==5){
            criteria.andStatusEqualTo(3);
        }
        List<Food> foods=foodMapper.selectByExample(example);
        if(foods==null||foods.isEmpty())return null;
        PageInfo pageInfo=new PageInfo(foods);

        return pageInfo;
    }

    public Food getFoodById(String id) {

        Food food=foodMapper.selectByPrimaryKey(id);
        if(food==null) return null;

        return food;
    }

    public int updateFoodStatusById(int status, String id) {

        Food food=foodMapper.selectByPrimaryKey(id);
        if(food==null) return 0;

        //status 0、通过
        if(status==0){
            food.setStatus(1);
            food.setScore(5f);
            food.setThoughtime(new Date());

        }
        else{
            food.setStatus(2);
        }


        return foodMapper.updateByPrimaryKey(food);
    }

    public int getTotal(int status) {

        FoodExample example=new FoodExample();
        FoodExample.Criteria criteria=example.createCriteria();
        criteria.andStatusEqualTo(status);

        return foodMapper.countByExample(example);
    }
}
