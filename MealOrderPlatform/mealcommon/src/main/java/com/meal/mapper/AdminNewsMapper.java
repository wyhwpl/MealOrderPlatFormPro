package com.meal.mapper;

import com.meal.pojo.AdminNews;
import com.meal.pojo.AdminNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminNewsMapper {
    int countByExample(AdminNewsExample example);

    int deleteByExample(AdminNewsExample example);

    int deleteByPrimaryKey(String id);

    int insert(AdminNews record);

    int insertSelective(AdminNews record);

    List<AdminNews> selectByExample(AdminNewsExample example);

    AdminNews selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AdminNews record, @Param("example") AdminNewsExample example);

    int updateByExample(@Param("record") AdminNews record, @Param("example") AdminNewsExample example);

    int updateByPrimaryKeySelective(AdminNews record);

    int updateByPrimaryKey(AdminNews record);
}