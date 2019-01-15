package com.learn.mybatis.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;


import static org.junit.Assert.*;

public class MyBatisUtilTest {

    private Logger logger = Logger.getLogger(MyBatisUtilTest.class);

    @Test
    public void openSession() {
        SqlSession sqlSession = MyBatisUtil.openSession();
        logger.info(sqlSession.toString());
        sqlSession.close();
    }
}
