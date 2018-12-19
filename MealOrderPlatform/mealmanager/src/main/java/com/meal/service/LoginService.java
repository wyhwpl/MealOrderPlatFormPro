package com.meal.service;

import com.meal.commons.CheckResult;
import com.meal.pojo.Admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
@author 汪培林

@create 2018-10-20-19:34
*/
public interface LoginService {

    CheckResult loginCheck(HttpServletRequest request, HttpServletResponse response, Admin admin);

}
