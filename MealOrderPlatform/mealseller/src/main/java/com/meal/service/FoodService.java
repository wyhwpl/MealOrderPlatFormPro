package com.meal.service;

import com.meal.pojo.Food;
import com.meal.pojo.FoodAndSeller;

import java.util.List;

/*
@author 汪培林

@create 2018-12-03-12:27
*/
public interface FoodService {

    List<Food> getAllFood(int sellerId);

    List<Food> getFoodByExample(int sellerId,int param,int type);

    FoodAndSeller getFoodDetails(int foodId);

    int modifyFoodByExample(int foodId,String param,int type);

    int addFood(Food food,int sellerId);

    int underCarriage(int foodId,int sellerId);


}
