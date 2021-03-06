package com.meal.service.impl;

import com.meal.commons.CreateUUID;
import com.meal.mapper.*;
import com.meal.pojo.*;
import com.meal.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

/*
@author 汪培林

@create 2018-12-03-12:43
*/
@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodMapper foodMapper;

    @Autowired
    private FoodAndSellerMapper foodAndSellerMapper;

    @Autowired
    private AdminTasksMapper adminTasksMapper;

    @Autowired
    private AdminNewsMapper adminNewsMapper;

    @Autowired
    private SellerMapper sellerMapper;

    @Autowired
    private AdminMapper adminMapper;


    public List<Food> getAllFood(String sellerId) {

        FoodExample example=new FoodExample();
        FoodExample.Criteria criteria=example.createCriteria();
        criteria.andSelleridEqualTo(sellerId);
        List<Food> foods=foodMapper.selectByExample(example);
        if(foods==null||foods.isEmpty()){
            return null;
        }

        return foods;
    }

    public List<Food> getFoodByExample(String sellerId, String param, int type) {

        FoodExample example=new FoodExample();
        FoodExample.Criteria criteria=example.createCriteria();
        criteria.andSelleridEqualTo(sellerId);

        //type=1、2、3 代表菜品id、分类标签id、 菜品状态

        if(type==1){
            criteria.andIdEqualTo(param);
        }
        if(type==2){
            criteria.andTagidEqualTo(param);
        }
        if(type==3){
            criteria.andStatusEqualTo(Integer.parseInt(param));
        }

        List<Food> foods=foodMapper.selectByExample(example);
        if(foods==null||foods.isEmpty()){
            return null;
        }

        return foods;
    }

    public FoodAndSeller getFoodDetails(String foodId) {
        FoodAndSeller foodAndSeller=foodAndSellerMapper.selectByPrimaryKey(foodId);
        return foodAndSeller;
    }

    public int modifyFoodByExample(String foodId, String param, int type) {

        Food food=foodMapper.selectByPrimaryKey(foodId);
        if(food==null) return 0;

        //type =1、2、3、4、5代表菜品名称、菜品描述、分类标签、现价、菜品图片路径
        if(type==1){
            food.setFoodname(param);
        }
        if(type==2){
            food.setDescription(param);
        }
        if(type==3){
            food.setTagid(param);
        }
        if(type==4){
            food.setPrice(Float.parseFloat(param));
        }
        if(type==5){
            food.setImgUrl(param);
        }
        return foodMapper.updateByPrimaryKey(food);
    }

    public int addFood(Food food, String sellerId) {

        String id= CreateUUID.createUUID();
        Date time=new Date();
        food.setId(id);
        food.setSellerid(sellerId);
        food.setApplicationtime(time);
        food.setScore(0f);
        food.setStatus(0);
        food.setOriginPrice(food.getPrice());


        int result=foodMapper.insert(food);
        if(result!=0){
            AdminTasks tasks=new AdminTasks();
            tasks.setId(CreateUUID.createUUID());
            tasks.setTaskkind(3);
            tasks.setObjectid(id);
            tasks.setUsername(food.getFoodname());
            tasks.setStatus(0);
            tasks.setTasktime(time);
            Random random=new Random();
            AdminExample example=new AdminExample();

            int count=adminMapper.countByExample(example);
            List<Admin> admins=adminMapper.selectByExample(example);

            int s=random.nextInt(count)%(count-1+1)+1;
            String adminId=admins.get(s).getId();
            System.out.println(adminId);
            tasks.setAdminid(adminId);
            int res=adminTasksMapper.insert(tasks);
            AdminNews news=new AdminNews();
            news.setId(CreateUUID.createUUID());
            news.setUserkind(1);
            news.setUserid(sellerId);
            news.setUsername(sellerMapper.selectByPrimaryKey(sellerId).getName());
            news.setAction("申请上架");
            news.setActionobject("菜品"+food.getFoodname());
            news.setNewstime(time);
            adminNewsMapper.insert(news);
            return res;
        }
        return result;
    }

    public int underCarriage(String foodId,String sellerId) {

        Date time=new Date();
        Food food=foodMapper.selectByPrimaryKey(foodId);
        food.setStatus(3);
        food.setUndercarriagetime(time);
        int result=foodMapper.updateByPrimaryKey(food);
        AdminNews news=new AdminNews();
        news.setId(CreateUUID.createUUID());
        news.setUserkind(1);
        news.setUserid(sellerId);
        news.setUsername(sellerMapper.selectByPrimaryKey(sellerId).getName());
        news.setAction("下架");
        news.setActionobject("菜品"+food.getFoodname());
        news.setNewstime(time);
        adminNewsMapper.insert(news);

        return result;
    }
}
