package com.meal.service;

import com.meal.pojo.Classify;

import java.util.List;

/*
@author 汪培林

@create 2018-12-03-13:22
*/
public interface ClassifyService {


    List<Classify> getAllClassify(String sellerId);

    Classify getClassifyById(String tagId);

    int addTag(Classify classify,String sellerId);

    int modifyTag(String tagId,String tagName);

}
