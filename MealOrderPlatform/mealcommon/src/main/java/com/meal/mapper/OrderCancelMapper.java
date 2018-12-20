package com.meal.mapper;

import com.meal.pojo.OrderCancel;
import com.meal.pojo.OrderCancelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderCancelMapper {
    int countByExample(OrderCancelExample example);

    int deleteByExample(OrderCancelExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderCancel record);

    int insertSelective(OrderCancel record);

    List<OrderCancel> selectByExample(OrderCancelExample example);

    OrderCancel selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderCancel record, @Param("example") OrderCancelExample example);

    int updateByExample(@Param("record") OrderCancel record, @Param("example") OrderCancelExample example);

    int updateByPrimaryKeySelective(OrderCancel record);

    int updateByPrimaryKey(OrderCancel record);
}