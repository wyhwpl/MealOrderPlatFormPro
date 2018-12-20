package com.meal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meal.mapper.RiderMapper;
import com.meal.pojo.Rider;
import com.meal.pojo.RiderExample;
import com.meal.service.RiderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        List<Rider> riders=riderMapper.selectByExample(example);
        if(riders==null||riders.isEmpty()) return null;
        PageInfo pageInfo=new PageInfo(riders);

        return pageInfo;
    }

    public Rider getRiderById(String id) {
        Rider rider=riderMapper.selectByPrimaryKey(id);
        if(rider==null) return null;
        return rider;
    }

    public int updateRiderStatusById(int status, String id) {

        Rider rider=riderMapper.selectByPrimaryKey(id);
        if(rider==null) return 0;

        //status 0、通过
        if(status==0){
            rider.setStatus(1);
            rider.setThoughtime(new Date());
            rider.setScore(5f);
        }else{
            rider.setStatus(2);
        }
        return riderMapper.updateByPrimaryKey(rider);
    }

    public int getTotal(int status) {

        RiderExample example=new RiderExample();
        RiderExample.Criteria criteria=example.createCriteria();
        criteria.andStatusEqualTo(status);

        return riderMapper.countByExample(example);
    }
}
