package com.meal.util;

import com.meal.pojo.Rider;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
@author 汪培林

@create 2018-12-20-20:26
*/
public class CalculRider {

    public static String calculRider(List<Rider> riders){

        Collections.sort(riders, new Comparator<Rider>() {
            public int compare(Rider o1, Rider o2) {
                return o1.getScore().compareTo(o2.getScore());
            }
        });

        return riders.get(0).getId();
    }
}
