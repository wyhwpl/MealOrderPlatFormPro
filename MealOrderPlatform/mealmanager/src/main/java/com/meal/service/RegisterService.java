package com.meal.service;

import com.meal.commons.CheckResult;
import com.meal.pojo.Admin;

/*
@author 汪培林

@create 2018-10-21-12:24
*/
public interface RegisterService {


    CheckResult checkData(String param, Integer type);
    CheckResult register(Admin admin);

}
