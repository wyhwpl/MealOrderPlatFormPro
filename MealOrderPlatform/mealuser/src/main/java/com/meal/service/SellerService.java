package com.meal.service;

import com.meal.pojo.Seller;

import java.util.List;

/*
@author 汪培林

@create 2018-12-19-14:58
*/
public interface SellerService {

    Seller getSellerById(String sellerId);

    List<Seller> getSellerByExample(String address);
}
