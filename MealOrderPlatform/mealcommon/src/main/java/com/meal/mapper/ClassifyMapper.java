package com.meal.mapper;

import com.meal.pojo.Classify;
import com.meal.pojo.ClassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassifyMapper {
    int countByExample(ClassifyExample example);

    int deleteByExample(ClassifyExample example);

    int deleteByPrimaryKey(String id);

    int insert(Classify record);

    int insertSelective(Classify record);

    List<Classify> selectByExample(ClassifyExample example);

    Classify selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Classify record, @Param("example") ClassifyExample example);

    int updateByExample(@Param("record") Classify record, @Param("example") ClassifyExample example);

    int updateByPrimaryKeySelective(Classify record);

    int updateByPrimaryKey(Classify record);
}