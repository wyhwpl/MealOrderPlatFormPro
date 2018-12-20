package com.meal.service;

import com.meal.pojo.Food;
import com.meal.pojo.FoodAndSeller;

import java.util.List;

/*
@author 汪培林

@create 2018-12-03-12:27
*/
public interface FoodService {

    List<Food> getAllFood(String sellerId);

    List<Food> getFoodByExample(String sellerId,String param,int type);

    FoodAndSeller getFoodDetails(String foodId);

    int modifyFoodByExample(String foodId,String param,int type);

    int addFood(Food food,String sellerId);

    int underCarriage(String foodId,String sellerId);


}
