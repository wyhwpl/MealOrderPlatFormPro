package com.meal.service.impl;

import com.meal.commons.CheckResult;
import com.meal.mapper.AdminNewsMapper;
import com.meal.mapper.AdminTasksMapper;
import com.meal.mapper.SellerMapper;
import com.meal.pojo.AdminNews;
import com.meal.pojo.AdminTasks;
import com.meal.pojo.Seller;
import com.meal.pojo.SellerExample;
import com.meal.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;
import java.util.Random;

/*
@author 汪培林

@create 2018-12-04-13:20
*/
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerMapper sellerMapper;

    @Autowired
    private AdminTasksMapper adminTasksMapper;

    @Autowired
    private AdminNewsMapper adminNewsMapper;


    public CheckResult loginCheck(HttpServletRequest request, HttpServletResponse response,Seller seller) {

        SellerExample example =new SellerExample();
        SellerExample.Criteria criteria=example.createCriteria();
        criteria.andLoginidEqualTo(seller.getLoginid());
        criteria.andPasswordEqualTo(DigestUtils.md5DigestAsHex(seller.getPassword().getBytes()));

        List<Seller> sellers=sellerMapper.selectByExample(example);
        if(sellers.isEmpty()||sellers==null){
            return CheckResult.build(400,"用户名或密码错误");
        }
        Seller sellerSession =sellers.get(0);
        sellerSession.setPassword(seller.getPassword());
        request.getSession().setAttribute("seller",sellerSession);

        /*Cookie Id=new Cookie("sellerId",String.valueOf(sellers.get(0).getId()));
        Cookie loginId=new Cookie("loginId",seller.getLoginid());
        Cookie password=new Cookie("password",seller.getPassword());
        Cookie phone=new Cookie("phone",sellers.get(0).getPhone());
        Cookie name=null;
        Cookie address=null;
        Cookie reason=null;
        try {
            name=new Cookie("name",URLEncoder.encode(sellers.get(0).getName(),"UTF-8"));
            address=new Cookie("address", URLEncoder.encode(sellers.get(0).getAddress(),"UTF-8"));
            reason=new Cookie("reason",URLEncoder.encode(sellers.get(0).getReason(),"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Cookie status=new Cookie("status",String.valueOf(sellers.get(0).getStatus()));
        Cookie imgUrl=new Cookie("imgUrl",sellers.get(0).getImgUrl());
        Cookie score=new Cookie("score",String.valueOf(sellers.get(0).getScore()));

        response.addCookie(Id);
        response.addCookie(loginId);
        response.addCookie(password);
        response.addCookie(phone);
        response.addCookie(name);
        response.addCookie(address);
        response.addCookie(reason);
        response.addCookie(status);
        response.addCookie(imgUrl);
        response.addCookie(score);
*/
        return CheckResult.build(200,"登录成功");
    }

    public int ApplicationAgain(int sellerId, Seller seller) {

        Seller sellerI=sellerMapper.selectByPrimaryKey(sellerId);

        Date time=new Date();
        seller.setId(sellerI.getId());
        seller.setLoginid(sellerI.getLoginid());
        seller.setPassword(sellerI.getPassword());
        seller.setIdcard(sellerI.getIdcard());
        seller.setPhone(sellerI.getPhone());
        seller.setRegtime(time);
        seller.setScore(0f);
        seller.setStatus(0);
        int result=sellerMapper.updateByPrimaryKey(seller);
        if(result!=0){
            AdminTasks tasks=new AdminTasks();
            tasks.setTaskkind(1);
            tasks.setObjectid(sellerId);
            tasks.setUsername(seller.getName());
            tasks.setStatus(0);
            tasks.setTasktime(time);
            Random random=new Random();
            int s=random.nextInt(4)%(4-1+1)+1;
            System.out.println(s);
            tasks.setAdminid(s);
            int res=adminTasksMapper.insert(tasks);
            AdminNews news=new AdminNews();
            news.setUserkind(1);
            news.setUserid(sellerId);
            news.setUsername(seller.getName());
            news.setAction("申请注册");
            news.setActionobject("店铺"+seller.getSellername());
            news.setNewstime(time);
            adminNewsMapper.insert(news);
            return res;
        }
        return result;
    }

    public int logout(int sellerId) {

        Seller seller=sellerMapper.selectByPrimaryKey(sellerId);

        Date time=new Date();
        seller.setStatus(3);
        seller.setLogouttime(time);

        int result=sellerMapper.updateByPrimaryKey(seller);

        AdminNews news=new AdminNews();
        news.setUserkind(1);
        news.setUserid(sellerId);
        news.setUsername(seller.getName());
        news.setAction("注销");
        news.setActionobject("店铺"+seller.getSellername());
        news.setNewstime(time);
        adminNewsMapper.insert(news);
        return result;
    }
}
