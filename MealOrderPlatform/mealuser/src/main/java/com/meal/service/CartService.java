package com.meal.service;

import com.meal.pojo.CartFood;

import java.util.List;

/*
@author 汪培林

@create 2018-12-19-18:23
*/
public interface CartService {

    int createCart(String sellerId,String userId);
    int addCartFood(String sellerId,String userId,String foodId);
    int subCartFood(String sellerId,String userId,String foodId);
    List<CartFood> getAll(String sellerId, String userId);
    int countCartFood(String sellerId,String userId);
    int clearCartFood(String sellerId,String userId);
}
