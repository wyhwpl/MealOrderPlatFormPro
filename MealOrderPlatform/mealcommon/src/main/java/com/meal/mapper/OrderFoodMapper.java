package com.meal.mapper;

import com.meal.pojo.OrderFood;
import com.meal.pojo.OrderFoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderFoodMapper {
    int countByExample(OrderFoodExample example);

    int deleteByExample(OrderFoodExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderFood record);

    int insertSelective(OrderFood record);

    List<OrderFood> selectByExample(OrderFoodExample example);

    OrderFood selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderFood record, @Param("example") OrderFoodExample example);

    int updateByExample(@Param("record") OrderFood record, @Param("example") OrderFoodExample example);

    int updateByPrimaryKeySelective(OrderFood record);

    int updateByPrimaryKey(OrderFood record);
}