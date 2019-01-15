package com.learn.mybatis.mapper;

import com.learn.mybatis.pojo.FemaleHealthForm;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/15 10:58
 * @version : 1.0
 */
public interface FemaleHealthFormMapper {
    FemaleHealthForm findFemaleHealthFormByEmpId(Long empId);
}
