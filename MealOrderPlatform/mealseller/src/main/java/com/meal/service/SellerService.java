package com.meal.service;

import com.meal.commons.CheckResult;
import com.meal.pojo.Seller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
@author 汪培林

@create 2018-12-04-13:07
*/
public interface SellerService {

    CheckResult loginCheck(HttpServletRequest request, HttpServletResponse response,Seller seller);

    int ApplicationAgain(int sellerId,Seller seller);

    int logout(int sellerId);

}
