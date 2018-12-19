package com.meal.commons;

import com.meal.pojo.Food;

import java.util.List;

/*
@author 汪培林

@create 2018-12-19-14:20
*/
public class TypeFood {

    private int typeId;

    private String typeName;

    private List<Food> foods;

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String  typeName) {
        this.typeName = typeName;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }
}
