package com.meal.mapper;

import com.meal.pojo.RecentLogin;
import com.meal.pojo.RecentLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecentLoginMapper {
    int countByExample(RecentLoginExample example);

    int deleteByExample(RecentLoginExample example);

    int deleteByPrimaryKey(String id);

    int insert(RecentLogin record);

    int insertSelective(RecentLogin record);

    List<RecentLogin> selectByExample(RecentLoginExample example);

    RecentLogin selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RecentLogin record, @Param("example") RecentLoginExample example);

    int updateByExample(@Param("record") RecentLogin record, @Param("example") RecentLoginExample example);

    int updateByPrimaryKeySelective(RecentLogin record);

    int updateByPrimaryKey(RecentLogin record);
}