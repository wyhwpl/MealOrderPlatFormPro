package com.meal.controller;

import com.github.pagehelper.PageInfo;
import com.meal.pojo.Seller;
import com.meal.service.SellerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
@author 汪培林

@create 2018-11-01-17:37
*/
@Controller
@RequestMapping(value = "/sellerInfo")
public class SellerInfoController {

    @Autowired
    private SellerInfoService sellerInfoService;

    @RequestMapping(value = "/all/{type}")
    @ResponseBody
    public PageInfo getSeller(@PathVariable int type,
                              @RequestParam("pageNum")int pageNum,
                              @RequestParam("pageSize")int pageSize){

        System.out.println(type+"  "+pageNum+"  "+pageSize);
        PageInfo pageInfo= sellerInfoService.getSellerInfo(pageNum, pageSize,type);
        if(pageInfo==null) System.out.println("meiyouchadao");
        System.out.println(pageInfo.getPageNum());
        System.out.println(pageInfo.getTotal());
        return pageInfo;
    }

    @RequestMapping(value = "/byId/{id}")
    @ResponseBody
    public Seller getSellerById(@PathVariable int id){
        return sellerInfoService.getSellerById(id);
    }

    @RequestMapping(value = "/though/{id}")
    @ResponseBody
    public int though(@PathVariable int id){

        return sellerInfoService.updateSellerStatusById(0,null,id);
    }

    @RequestMapping(value = "/notthough/{id}")
    @ResponseBody
    public int notThough(@PathVariable int id,
                         @RequestParam("reason")String reason){

        System.out.println(reason);
        return sellerInfoService.updateSellerStatusById(1,reason,id);
    }

    @RequestMapping(value = "/getSum")
    @ResponseBody
    public int getTotal(@RequestParam("status") int status){
        return sellerInfoService.getTotal(status);
    }

}
