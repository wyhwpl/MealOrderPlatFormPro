package com.meal.controller;

import com.meal.pojo.CartFood;
import com.meal.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
@author 汪培林

@create 2018-12-20-13:09
*/
@Controller
@RequestMapping(value = "/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/create")
    @ResponseBody
    public int createCart(@RequestParam("sellerId")String sellerId,
                          @RequestParam("userId")String userId){
        return cartService.createCart(sellerId, userId);
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public int addFood(@RequestParam("sellerId")String sellerId,
                       @RequestParam("userId")String userId,
                       @RequestParam("foodId")String foodId){
        return cartService.addCartFood(sellerId, userId, foodId);
    }

    @RequestMapping(value = "/sub")
    @ResponseBody
    public int subFood(@RequestParam("sellerId")String sellerId,
                       @RequestParam("userId")String userId,
                       @RequestParam("foodId")String foodId){
        return cartService.subCartFood(sellerId, userId, foodId);
    }

    @RequestMapping(value = "/getAll")
    @ResponseBody
    public List<CartFood> getAll(@RequestParam("sellerId")String sellerId,
                                 @RequestParam("userId")String userId){
        return cartService.getAll(sellerId, userId);
    }

    @RequestMapping(value = "/count")
    @ResponseBody
    public int countCart(@RequestParam("sellerId")String sellerId,
                         @RequestParam("userId")String userId){
        return cartService.countCartFood(sellerId, userId);
    }

    @RequestMapping(value = "/clear")
    @ResponseBody
    public int clearCart(@RequestParam("sellerId")String sellerId,
                         @RequestParam("userId")String userId){
        return cartService.clearCartFood(sellerId, userId);
    }

}
