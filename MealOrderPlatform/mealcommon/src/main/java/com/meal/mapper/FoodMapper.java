package com.meal.mapper;

import com.meal.pojo.Food;
import com.meal.pojo.FoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodMapper {
    int countByExample(FoodExample example);

    int deleteByExample(FoodExample example);

    int deleteByPrimaryKey(String id);

    int insert(Food record);

    int insertSelective(Food record);

    List<Food> selectByExample(FoodExample example);

    Food selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Food record, @Param("example") FoodExample example);

    int updateByExample(@Param("record") Food record, @Param("example") FoodExample example);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);
}