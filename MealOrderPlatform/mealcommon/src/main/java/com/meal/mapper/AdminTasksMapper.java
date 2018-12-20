package com.meal.mapper;

import com.meal.pojo.AdminTasks;
import com.meal.pojo.AdminTasksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminTasksMapper {
    int countByExample(AdminTasksExample example);

    int deleteByExample(AdminTasksExample example);

    int deleteByPrimaryKey(String id);

    int insert(AdminTasks record);

    int insertSelective(AdminTasks record);

    List<AdminTasks> selectByExample(AdminTasksExample example);

    AdminTasks selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AdminTasks record, @Param("example") AdminTasksExample example);

    int updateByExample(@Param("record") AdminTasks record, @Param("example") AdminTasksExample example);

    int updateByPrimaryKeySelective(AdminTasks record);

    int updateByPrimaryKey(AdminTasks record);
}