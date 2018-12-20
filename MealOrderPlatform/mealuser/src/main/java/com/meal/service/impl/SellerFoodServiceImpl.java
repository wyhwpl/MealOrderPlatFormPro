package com.meal.service.impl;

import com.meal.commons.SellerFood;
import com.meal.commons.TypeFood;
import com.meal.mapper.ClassifyMapper;
import com.meal.mapper.FoodMapper;
import com.meal.pojo.Classify;
import com.meal.pojo.ClassifyExample;
import com.meal.pojo.Food;
import com.meal.pojo.FoodExample;
import com.meal.service.SellerFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
@author 汪培林

@create 2018-12-19-14:24
*/
@Service
public class SellerFoodServiceImpl implements SellerFoodService {

    @Autowired
    private FoodMapper foodMapper;

    @Autowired
    private ClassifyMapper classifyMapper;


    public SellerFood getSellerFood(String sellerId) {
        ClassifyExample classifyExample=new ClassifyExample();
        ClassifyExample.Criteria criteria=classifyExample.createCriteria();
        criteria.andSelleridEqualTo(sellerId);
        List<Classify> classifies=classifyMapper.selectByExample(classifyExample);

        if(classifies==null||classifies.isEmpty()){
            return null;
        }
        List<TypeFood> typeFoods=new ArrayList<TypeFood>();
        for (int i = 0; i <classifies.size() ; i++) {
            TypeFood food=new TypeFood();
            food.setTypeId(classifies.get(i).getId());
            food.setTypeName(classifies.get(i).getClassifytag());
            FoodExample example=new FoodExample();
            FoodExample.Criteria foodCriteria=example.createCriteria();
            foodCriteria.andTagidEqualTo(classifies.get(i).getId());
            List<Food> foods=foodMapper.selectByExample(example);
            if(foods==null||foods.isEmpty()){
                food.setFoods(null);
            }
            food.setFoods(foods);
            typeFoods.add(food);
        }
        SellerFood sellerFood=new SellerFood();
        sellerFood.setTypeList(typeFoods);
        return sellerFood;
    }
}
