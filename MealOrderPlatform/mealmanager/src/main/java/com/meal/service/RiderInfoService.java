package com.meal.service;

import com.github.pagehelper.PageInfo;
import com.meal.pojo.Rider;

/*
@author 汪培林

@create 2018-11-01-17:43
*/
public interface RiderInfoService {
    PageInfo getRiderInfoByType(int type, int pageNum, int pageSize);

    Rider getRiderById(String id);

    int updateRiderStatusById(int status, String id);

    int getTotal(int status);
}
