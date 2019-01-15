package com.learn.mybatis.mapper;

import com.learn.mybatis.pojo.MaleHealthForm;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/15 10:47
 * @version : 1.0
 */
public interface MaleHealthFormMapper {
    MaleHealthForm findMaleHealthFormByEmpId(Long empId);
}
