package com.learn.mybatis;


import com.learn.mybatis.mapper.EmployeeMapper;
import com.learn.mybatis.pojo.Employee;
import com.learn.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

public class CascadeApplication {

    private static Logger logger = Logger.getLogger(CascadeApplication.class);

    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.openSession();
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = employeeMapper.findEmployeeById(1L);
            logger.info(employee);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null)
                sqlSession.close();
        }
    }
}
