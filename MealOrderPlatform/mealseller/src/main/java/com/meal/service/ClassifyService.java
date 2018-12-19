package com.meal.service;

import com.meal.pojo.Classify;

import java.util.List;

/*
@author 汪培林

@create 2018-12-03-13:22
*/
public interface ClassifyService {


    List<Classify> getAllClassify(int sellerId);

    Classify getClassifyById(int tagId);

    int addTag(Classify classify,int sellerId);

    int modifyTag(int tagId,String tagName);

}
