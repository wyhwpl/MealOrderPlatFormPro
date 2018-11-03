package com.meal.service;

import com.github.pagehelper.PageInfo;

/*
@author 汪培林

@create 2018-11-01-16:35
*/
public interface SellerInfoService {

    PageInfo getSellerInfo(int pageNum, int pageSize, int type);

}
