package com.meal.mapper;

import com.meal.pojo.CartFood;
import com.meal.pojo.CartFoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartFoodMapper {
    int countByExample(CartFoodExample example);

    int deleteByExample(CartFoodExample example);

    int deleteByPrimaryKey(String id);

    int insert(CartFood record);

    int insertSelective(CartFood record);

    List<CartFood> selectByExample(CartFoodExample example);

    CartFood selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CartFood record, @Param("example") CartFoodExample example);

    int updateByExample(@Param("record") CartFood record, @Param("example") CartFoodExample example);

    int updateByPrimaryKeySelective(CartFood record);

    int updateByPrimaryKey(CartFood record);
}