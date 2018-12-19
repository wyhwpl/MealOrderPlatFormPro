package com.meal.service;

import com.meal.commons.CheckResult;
import com.meal.pojo.Rider;

/*
@author 汪培林

@create 2018-12-12-18:52
*/
public interface RegisterService {

    CheckResult checkData(String param,int type);

    CheckResult register(Rider rider);

}
