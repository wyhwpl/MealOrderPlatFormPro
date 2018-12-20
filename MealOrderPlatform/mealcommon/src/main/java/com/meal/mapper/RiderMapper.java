package com.meal.mapper;

import com.meal.pojo.Rider;
import com.meal.pojo.RiderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiderMapper {
    int countByExample(RiderExample example);

    int deleteByExample(RiderExample example);

    int deleteByPrimaryKey(String id);

    int insert(Rider record);

    int insertSelective(Rider record);

    List<Rider> selectByExample(RiderExample example);

    Rider selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Rider record, @Param("example") RiderExample example);

    int updateByExample(@Param("record") Rider record, @Param("example") RiderExample example);

    int updateByPrimaryKeySelective(Rider record);

    int updateByPrimaryKey(Rider record);
}