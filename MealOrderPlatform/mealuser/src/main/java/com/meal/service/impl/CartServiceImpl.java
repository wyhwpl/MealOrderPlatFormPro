package com.meal.service.impl;

import com.meal.commons.CreateUUID;
import com.meal.mapper.CartFoodMapper;
import com.meal.mapper.CartMapper;
import com.meal.pojo.Cart;
import com.meal.pojo.CartExample;
import com.meal.pojo.CartFood;
import com.meal.pojo.CartFoodExample;
import com.meal.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author 汪培林

@create 2018-12-19-18:34
*/
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;

    @Autowired
    private CartFoodMapper cartFoodMapper;


    public int createCart(String sellerId, String userId) {

        CartExample cartExample=new CartExample();
        CartExample.Criteria cartCriteria=cartExample.createCriteria();
        cartCriteria.andUseridEqualTo(userId);
        cartCriteria.andSelleridEqualTo(sellerId);
        List<Cart> carts=cartMapper.selectByExample(cartExample);
        if(carts==null||carts.isEmpty()){

            Cart cart=new Cart();
            cart.setId(CreateUUID.createUUID());
            cart.setSellerid(sellerId);
            cart.setUserid(userId);
            return cartMapper.insert(cart);
        }

        return 0;
    }

    public int addCartFood(String sellerId, String userId,String foodId) {
        CartExample cartExample=new CartExample();
        CartExample.Criteria cartCriteria=cartExample.createCriteria();
        cartCriteria.andUseridEqualTo(userId);
        cartCriteria.andSelleridEqualTo(sellerId);
        List<Cart> carts=cartMapper.selectByExample(cartExample);
        if(carts==null||carts.isEmpty()){
            createCart(sellerId, userId);
        }
        carts=cartMapper.selectByExample(cartExample);
        String cartId=carts.get(0).getId();
        CartFoodExample foodExample=new CartFoodExample();
        CartFoodExample.Criteria foodCriteria=foodExample.createCriteria();
        foodCriteria.andCartidEqualTo(cartId);
        foodCriteria.andFoodidEqualTo(foodId);
        List<CartFood> cartFoods=cartFoodMapper.selectByExample(foodExample);
        if(cartFoods==null||cartFoods.isEmpty()){
            CartFood cartFood=new CartFood();
            cartFood.setId(CreateUUID.createUUID());
            cartFood.setCartid(cartId);
            cartFood.setCopies(1);
            cartFood.setFoodid(foodId);
            return cartFoodMapper.insert(cartFood);
        } else{
            CartFood cartFood=cartFoods.get(0);
            cartFood.setCopies(cartFood.getCopies()+1);
            return cartFoodMapper.updateByPrimaryKey(cartFood);
        }

    }

    public int subCartFood(String sellerId, String userId,String foodId) {
        CartExample cartExample=new CartExample();
        CartExample.Criteria cartCriteria=cartExample.createCriteria();
        cartCriteria.andUseridEqualTo(userId);
        cartCriteria.andSelleridEqualTo(sellerId);
        List<Cart> carts=cartMapper.selectByExample(cartExample);
        if(carts==null||carts.isEmpty()){
            createCart(sellerId, userId);
        }
        carts=cartMapper.selectByExample(cartExample);
        String cartId=carts.get(0).getId();
        CartFoodExample foodExample=new CartFoodExample();
        CartFoodExample.Criteria foodCriteria=foodExample.createCriteria();
        foodCriteria.andCartidEqualTo(cartId);
        foodCriteria.andFoodidEqualTo(foodId);
        List<CartFood> cartFoods=cartFoodMapper.selectByExample(foodExample);
        if(cartFoods==null||cartFoods.isEmpty()){
            return 0;
        }
        else{
            CartFood cartFood=cartFoods.get(0);
            if(cartFood.getCopies()==1){
                return cartFoodMapper.deleteByPrimaryKey(cartFood.getId());
            }
            cartFood.setCopies(cartFood.getCopies()-1);
            return cartFoodMapper.updateByPrimaryKey(cartFood);
        }
    }

    public List<CartFood> getAll(String sellerId,String userId) {

        CartExample cartExample=new CartExample();
        CartExample.Criteria cartCriteria=cartExample.createCriteria();
        cartCriteria.andUseridEqualTo(userId);
        cartCriteria.andSelleridEqualTo(sellerId);
        List<Cart> carts=cartMapper.selectByExample(cartExample);
        if(carts==null||carts.isEmpty()){
            return null;
        }
        String cartId=carts.get(0).getId();

        CartFoodExample example=new CartFoodExample();
        CartFoodExample.Criteria criteria=example.createCriteria();
        criteria.andCartidEqualTo(cartId);
        List<CartFood> cartFoods=cartFoodMapper.selectByExample(example);
        if(cartFoods==null||cartFoods.isEmpty()){
            return null;
        }
        return cartFoods;
    }

    public int countCartFood(String sellerId,String userId) {

        CartExample cartExample=new CartExample();
        CartExample.Criteria cartCriteria=cartExample.createCriteria();
        cartCriteria.andUseridEqualTo(userId);
        cartCriteria.andSelleridEqualTo(sellerId);
        List<Cart> carts=cartMapper.selectByExample(cartExample);
        if(carts==null||carts.isEmpty()){
            return 0;
        }
        String cartId=carts.get(0).getId();
        CartFoodExample example=new CartFoodExample();
        CartFoodExample.Criteria criteria=example.createCriteria();
        criteria.andCartidEqualTo(cartId);
        return cartFoodMapper.countByExample(example);

    }

    public int clearCartFood(String sellerId, String userId) {
        CartExample cartExample=new CartExample();
        CartExample.Criteria cartCriteria=cartExample.createCriteria();
        cartCriteria.andUseridEqualTo(userId);
        cartCriteria.andSelleridEqualTo(sellerId);
        List<Cart> carts=cartMapper.selectByExample(cartExample);
        if(carts==null||carts.isEmpty()){
            return 0;
        }
        String cartId=carts.get(0).getId();
        CartFoodExample example=new CartFoodExample();
        CartFoodExample.Criteria criteria=example.createCriteria();
        criteria.andCartidEqualTo(cartId);

        return cartFoodMapper.deleteByExample(example);
    }
}
