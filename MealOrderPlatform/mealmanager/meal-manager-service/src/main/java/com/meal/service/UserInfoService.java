package com.meal.service;

import com.github.pagehelper.PageInfo;


/*
@author 汪培林

@create 2018-10-31-12:56
*/
public interface UserInfoService {

    PageInfo getALLUserInfo(int pageNum, int pageSize);

}
