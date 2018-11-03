package com.meal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meal.mapper.RiderMapper;
import com.meal.pojo.Rider;
import com.meal.pojo.RiderExample;
import com.meal.service.RiderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author 汪培林

@create 2018-11-01-17:45
*/
@Service
public class RiderInfoServiceImpl implements RiderInfoService {

    @Autowired
    private RiderMapper riderMapper;

    public PageInfo getRiderInfoByType(int type, int pageNum, int pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        RiderExample example=new RiderExample();
        RiderExample.Criteria criteria=example.createCriteria();
        //type=1、2、3、4分别代表已审核、未审核、未通过审核、通过审核

        if(type==1){
            criteria.andIsauditEqualTo(1);
        }
        if(type==2){
            criteria.andIsauditEqualTo(0);
        }
        if(type==3){
            criteria.andIsauditEqualTo(1);
            criteria.andIsthoughEqualTo(0);
        }
        if(type==4){
            criteria.andIsauditEqualTo(1);
            criteria.andIsthoughEqualTo(1);
        }
        List<Rider> riders=riderMapper.selectByExample(example);
        if(riders.isEmpty()||riders==null) return null;
        PageInfo pageInfo=new PageInfo(riders);

        return pageInfo;
    }
}
