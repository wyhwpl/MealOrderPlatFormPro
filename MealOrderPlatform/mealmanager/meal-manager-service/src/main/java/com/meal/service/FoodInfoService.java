package com.meal.service;

import com.github.pagehelper.PageInfo;

/*
@author 汪培林

@create 2018-11-01-17:56
*/
public interface FoodInfoService {

    PageInfo getFoodInfoByType(int type, int pageNum, int pageSize);
}
