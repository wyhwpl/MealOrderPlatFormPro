package com.meal.service.impl;

import com.meal.mapper.FoodAndSellerMapper;
import com.meal.pojo.FoodAndSeller;
import com.meal.service.FoodAndSellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
@author 汪培林

@create 2018-11-30-14:15
*/
@Service
public class FoodAndSellerServiceImpl implements FoodAndSellerService {

    @Autowired
    private FoodAndSellerMapper foodAndSellerMapper;

    public FoodAndSeller getFoodAndSellerById(String id) {

        FoodAndSeller foodAndSeller=foodAndSellerMapper.selectByPrimaryKey(id);
        if(foodAndSeller==null)return null;
        return foodAndSeller;
    }
}
