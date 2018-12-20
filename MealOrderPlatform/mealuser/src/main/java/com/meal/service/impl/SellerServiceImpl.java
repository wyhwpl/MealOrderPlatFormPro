package com.meal.service.impl;

import com.meal.mapper.SellerMapper;
import com.meal.pojo.Seller;
import com.meal.pojo.SellerExample;
import com.meal.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author 汪培林

@create 2018-12-19-14:59
*/
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerMapper sellerMapper;


    public Seller getSellerById(String sellerId) {

        return sellerMapper.selectByPrimaryKey(sellerId);
    }

    public List<Seller> getSellerByExample(String address) {

        SellerExample example=new SellerExample();
        SellerExample.Criteria criteria=example.createCriteria();
        criteria.andAddressLike("%"+address+"%");
        criteria.andStatusEqualTo(1);
        List<Seller> sellers=sellerMapper.selectByExample(example);
        if(sellers==null||sellers.isEmpty()){
            return null;
        }
        return sellers;
    }
}
