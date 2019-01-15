package com.learn.mybatis.mapper;

import com.learn.mybatis.pojo.EmployeeTask;
import com.learn.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EmployeeTaskMapperTest {

    private Logger logger = Logger.getLogger(EmployeeTaskMapperTest.class);

    @Test
    public void findEmployeeTaskById() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.openSession();
            EmployeeTaskMapper employeeTaskMapper = sqlSession.getMapper(EmployeeTaskMapper.class);
            List<EmployeeTask> employeeTasks = employeeTaskMapper.findEmployeeTasksByEmpId(1L);
            for (EmployeeTask employeeTask : employeeTasks) {
                logger.info(employeeTask);
            }
            sqlSession.commit();
        } catch (Exception e) {
            assert sqlSession != null;
            sqlSession.rollback();
            e.printStackTrace();
        } finally {
            assert sqlSession != null;
            sqlSession.close();
        }
    }
}
