package com.meal.commons;

import java.util.UUID;

/*
@author 汪培林

@create 2018-12-20-17:05
*/
public class CreateUUID {

    public static String createUUID(){
        UUID uuid=UUID.randomUUID();
        String strU=uuid.toString();
        String[] strTemp=strU.split("-");
        String str="";
        for (int i = 0; i <strTemp.length ; i++) {
            str+=strTemp[i];
        }
        return str;
    }
}
