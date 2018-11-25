package com.meal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meal.mapper.SellerMapper;
import com.meal.pojo.Seller;
import com.meal.pojo.SellerExample;
import com.meal.service.SellerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author 汪培林

@create 2018-11-01-16:59
*/
@Service
public class SellerInfoServiceImpl implements SellerInfoService {

    @Autowired
    private SellerMapper sellerMapper;

    public PageInfo getSellerInfo(int pageNum, int pageSize, int type) {

        PageHelper.startPage(pageNum,pageSize);
        SellerExample example=new SellerExample();
        SellerExample.Criteria criteria=example.createCriteria();
        //type=1、已审核 2、未审核 3、通过审核 4、未通过审核 5、已注销
        if(type==1){
            criteria.andStatusBetween(1,2);
        }
        if(type==2){
            criteria.andStatusEqualTo(0);
        }
        if(type==3){
            criteria.andStatusEqualTo(1);
        }
        if(type==4){
            criteria.andStatusEqualTo(2);
        }
        if(type==5){
            criteria.andStatusEqualTo(3);
        }
        List<Seller> sellers=sellerMapper.selectByExample(example);
        if(sellers==null||sellers.isEmpty()){
            System.out.println("没有结果");
            return null;
        }
        PageInfo pageInfo=new PageInfo(sellers);

        return pageInfo;
    }
}
