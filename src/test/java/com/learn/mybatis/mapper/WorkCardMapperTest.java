package com.learn.mybatis.mapper;

import com.learn.mybatis.pojo.WorkCard;
import com.learn.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorkCardMapperTest {

    private Logger logger = Logger.getLogger(WorkCardMapperTest.class);

    @Test
    public void findWorkCardByEmpId() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.openSession();
            WorkCardMapper workCardMapper = sqlSession.getMapper(WorkCardMapper.class);
            WorkCard workCard = workCardMapper.findWorkCardByEmpId(1L);
            logger.info(workCard);
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