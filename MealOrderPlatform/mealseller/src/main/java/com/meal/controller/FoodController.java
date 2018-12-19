package com.meal.controller;

import com.meal.pojo.Food;
import com.meal.pojo.FoodAndSeller;
import com.meal.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
@author 汪培林

@create 2018-12-03-16:19
*/
@Controller
@RequestMapping(value = "/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @RequestMapping(value = "/getAll/{sellerId}")
    @ResponseBody
    public List<Food> getAllFood(@PathVariable int sellerId){
        return foodService.getAllFood(sellerId);
    }

    @RequestMapping(value = "/getByExample/{sellerId}/{param}/{type}")
    @ResponseBody
    public List<Food> getByExample(@PathVariable int sellerId,
                                   @PathVariable int param,
                                   @PathVariable int type){
        return foodService.getFoodByExample(sellerId, param, type);
    }

    @RequestMapping(value = "/getDetails/{foodId}")
    @ResponseBody
    public FoodAndSeller getDetails(@PathVariable int foodId){
        return foodService.getFoodDetails(foodId);
    }

    @RequestMapping(value = "/modifyByExample/{foodId}/{param}/{type}")
    @ResponseBody
    public int modifyByExample(@PathVariable int foodId,
                               @PathVariable String param,
                               @PathVariable int type){
        return foodService.modifyFoodByExample(foodId, param, type);
    }

    @RequestMapping(value = "/add/{sellerId}")
    @ResponseBody
    public int addFood(@PathVariable int sellerId, @RequestBody Food food){
        return foodService.addFood(food, sellerId);
    }


}
