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
        //type=1、2、3、4分别代表已审核、未审核、未通过审核、通过审核
        if(type==1){
            criteria.andIsauditEqualTo(1);
        }
        if(type==2){
            criteria.andIsauditEqualTo(0);
        }
        if(type==3){
            criteria.andIsauditEqualTo(1);
            criteria.andIsthoughEqualTo(1);
        }
        if(type==4){
            criteria.andIsauditEqualTo(1);
            criteria.andIsthoughEqualTo(0);
        }
        List<Seller> sellers=sellerMapper.selectByExample(example);
        if(sellers==null||sellers.isEmpty())return null;
        PageInfo pageInfo=new PageInfo(sellers);

        return pageInfo;
    }
}
