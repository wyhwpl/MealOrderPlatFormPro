package com.meal.service;

import com.github.pagehelper.PageInfo;
import com.meal.pojo.Seller;

/*
@author 汪培林

@create 2018-11-01-16:35
*/
public interface SellerInfoService {

    PageInfo getSellerInfo(int pageNum, int pageSize, int type);

    Seller getSellerById(String id);

    int updateSellerStatusById(int status, String reason, String id);

    int getTotal(int status);

}
