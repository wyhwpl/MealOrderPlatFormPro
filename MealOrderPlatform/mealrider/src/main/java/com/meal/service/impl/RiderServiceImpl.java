package com.meal.service.impl;

import com.meal.commons.CheckResult;
import com.meal.mapper.AdminNewsMapper;
import com.meal.mapper.AdminTasksMapper;
import com.meal.mapper.RiderMapper;
import com.meal.pojo.AdminNews;
import com.meal.pojo.AdminTasks;
import com.meal.pojo.Rider;
import com.meal.pojo.RiderExample;
import com.meal.service.RiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;
import java.util.Random;

/*
@author 汪培林

@create 2018-12-12-15:57
*/
@Service
public class RiderServiceImpl implements RiderService {

    @Autowired
    private RiderMapper riderMapper;

    @Autowired
    private AdminTasksMapper adminTasksMapper;

    @Autowired
    private AdminNewsMapper adminNewsMapper;


    public CheckResult loginCheck(HttpServletRequest request, HttpServletResponse response, Rider rider) {

        RiderExample example =new RiderExample();
        RiderExample.Criteria criteria=example.createCriteria();
        criteria.andPhoneEqualTo(rider.getPhone());
        criteria.andPasswordEqualTo(DigestUtils.md5DigestAsHex(rider.getPassword().getBytes()));

        List<Rider> riders=riderMapper.selectByExample(example);

        if(riders==null||riders.isEmpty()){
            return CheckResult.build(400,"账号或密码错误");
        }
        Rider riderSession=riders.get(0);
        riderSession.setPassword(rider.getPassword());
        request.getSession().setAttribute("rider",riderSession);
        return CheckResult.build(200,"登录成功");
    }

    public int applicationAgain(int riderId, Rider rider) {
        Rider riderI = riderMapper.selectByPrimaryKey(riderId);

        Date time=new Date();

        rider.setPhone(riderI.getPhone());
        rider.setPassword(riderI.getPassword());
        rider.setId(riderI.getId());
        rider.setStatus(0);
        rider.setRegtime(time);
        rider.setScore(0f);
        int result=riderMapper.updateByPrimaryKey(rider);
        if(result!=0){
            AdminTasks tasks=new AdminTasks();
            tasks.setTaskkind(2);
            tasks.setObjectid(riderId);
            tasks.setUsername(rider.getUsername());
            tasks.setStatus(0);
            tasks.setTasktime(time);
            Random random=new Random();
            int s=random.nextInt(4)%(4-1+1)+1;
            System.out.println(s);
            tasks.setAdminid(s);
            int res=adminTasksMapper.insert(tasks);
            AdminNews news=new AdminNews();
            news.setUserkind(3);
            news.setUserid(riderId);
            news.setUsername(rider.getUsername());
            news.setAction("申请注册");
            news.setActionobject("骑手");
            news.setNewstime(time);
            adminNewsMapper.insert(news);
            return res;
        }
        return 0;
    }

    public int logOff(int riderId) {
        Rider rider=riderMapper.selectByPrimaryKey(riderId);
        Date time=new Date();
        rider.setStatus(3);
        rider.setLogouttime(time);
        int result=riderMapper.updateByPrimaryKey(rider);
        AdminNews news=new AdminNews();
        news.setUserkind(3);
        news.setUserid(riderId);
        news.setUsername(rider.getUsername());
        news.setAction("注销");
        news.setActionobject("骑手");
        news.setNewstime(time);
        adminNewsMapper.insert(news);
        return result;
    }

    public int modifyAddress(int riderId, String address) {
        Rider rider=riderMapper.selectByPrimaryKey(riderId);
        rider.setAddress(address);
        return riderMapper.updateByPrimaryKey(rider);
    }

    public int modifySex(int riderId, String sex) {
        Rider rider=riderMapper.selectByPrimaryKey(riderId);
        rider.setAddress(sex);
        return riderMapper.updateByPrimaryKey(rider);
    }

}
