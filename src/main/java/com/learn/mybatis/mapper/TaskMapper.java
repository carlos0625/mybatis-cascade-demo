package com.learn.mybatis.mapper;

import com.learn.mybatis.pojo.Task;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/15 11:11
 * @version : 1.0
 */
public interface TaskMapper {
    Task findTaskById(Long id);
}
