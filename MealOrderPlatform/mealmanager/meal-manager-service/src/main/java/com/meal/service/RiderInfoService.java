package com.meal.service;

import com.github.pagehelper.PageInfo;

/*
@author 汪培林

@create 2018-11-01-17:43
*/
public interface RiderInfoService {
    PageInfo getRiderInfoByType(int type, int pageNum, int pageSize);
}
