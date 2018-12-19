package com.meal.service;

import com.meal.pojo.CartFood;

import java.util.List;

/*
@author 汪培林

@create 2018-12-19-18:23
*/
public interface CartService {

    int createCart(int sellerId,int userId);
    int addCartFood(int sellerId,int userId,int foodId);
    int subCartFood(int sellerId,int userId,int foodId);
    List<CartFood> getAll(int sellerId,int userId);
    int countCartFood(int sellerId,int userId);
}
