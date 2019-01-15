package com.learn.mybatis.mapper;

import com.learn.mybatis.pojo.Employee;
import com.learn.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EmployeeMapperTest {

    private Logger logger = Logger.getLogger(EmployeeMapperTest.class);

    @Test
    public void findEmployeeById() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.openSession();
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = employeeMapper.findEmployeeById(1L);
            logger.info(employee);
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

    @Test
    public void findAll() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.openSession();
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            List<Employee> employees = employeeMapper.findAll();
            for (Employee employee : employees) {
                logger.info(employee);
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