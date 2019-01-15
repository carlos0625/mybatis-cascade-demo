package com.learn.mybatis.mapper;

import com.learn.mybatis.pojo.Employee;

import java.util.List;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/15 13:39
 * @version : 1.0
 */
public interface EmployeeMapper {

    Employee findEmployeeById(Long id);

    List<Employee> findAll();

}
