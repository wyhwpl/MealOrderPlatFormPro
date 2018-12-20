package com.meal.service;

import com.meal.commons.CheckResult;
import com.meal.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
@author 汪培林

@create 2018-12-15-14:57
*/
public interface UserService {

    CheckResult loginCheck(HttpServletRequest request, HttpServletResponse response, User user);

    int logOff(String userId);
}
