package com.meal.service;

import com.meal.commons.CheckResult;
import com.meal.pojo.User;

/*
@author 汪培林

@create 2018-12-14-17:30
*/
public interface RegisterService {

    CheckResult checkData(String param,int type);

    CheckResult registerHandler(User user);
}
