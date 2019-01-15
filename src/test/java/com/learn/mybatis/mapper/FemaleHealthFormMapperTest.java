package com.learn.mybatis.mapper;

import com.learn.mybatis.pojo.FemaleHealthForm;
import com.learn.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.*;

public class FemaleHealthFormMapperTest {

    private Logger logger = Logger.getLogger(FemaleHealthFormMapperTest.class);
    @Test
    public void findFemaleHealthFormByEmpId() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.openSession();
            FemaleHealthFormMapper femaleHealthFormMapper = sqlSession.getMapper(FemaleHealthFormMapper.class);
            FemaleHealthForm femaleHealthForm = femaleHealthFormMapper.findFemaleHealthFormByEmpId(1L);
            logger.info(femaleHealthForm);
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}