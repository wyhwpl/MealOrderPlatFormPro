package com.meal.service;

import com.meal.commons.CheckResult;
import com.meal.pojo.Rider;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
@author 汪培林

@create 2018-12-12-15:56
*/
public interface RiderService {


    CheckResult loginCheck(HttpServletRequest request, HttpServletResponse response, Rider rider);

    int applicationAgain(int riderId,Rider rider);

    int logOff(int riderId);

    int modifyAddress(int riderId,String address);

    int modifySex(int riderId,String sex);

}
