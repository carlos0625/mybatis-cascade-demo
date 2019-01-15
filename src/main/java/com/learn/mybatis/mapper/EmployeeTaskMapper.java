package com.learn.mybatis.mapper;

import com.learn.mybatis.pojo.EmployeeTask;

import java.util.List;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/15 11:56
 * @version : 1.0
 */
public interface EmployeeTaskMapper {
    List<EmployeeTask> findEmployeeTasksByEmpId(Long EmpId);
}
