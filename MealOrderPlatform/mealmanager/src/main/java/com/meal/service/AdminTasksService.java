package com.meal.service;

import com.meal.pojo.AdminTasks;

import java.util.List;

/*
@author 汪培林

@create 2018-11-11-18:19
*/
public interface AdminTasksService {
    //返回全部任务
    List<AdminTasks> getAllTasks(int adminId);
    //返回指定个数任务
    List<AdminTasks> getSomeTasks(int num, int adminId);
    //通过条件返回任务
    List<AdminTasks> getTasksByExample(int type, int adminId);

    int updateTaskStatusById(int id);

    int getTotal(int status);

    int getAdminTask(int status, int adminId);
}
