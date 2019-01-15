package com.learn.mybatis.mapper;

import com.learn.mybatis.pojo.MaleHealthForm;
import com.learn.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import sun.rmi.runtime.Log;


import static org.junit.Assert.*;

public class MaleHealthFormMapperTest {

    private Logger logger = Logger.getLogger(MaleHealthFormMapperTest.class);

    @Test
    public void findMaleHealthFormByEmpId() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.openSession();
            MaleHealthFormMapper maleHealthFormMapper = sqlSession.getMapper(MaleHealthFormMapper.class);
            MaleHealthForm maleHealthForm = maleHealthFormMapper.findMaleHealthFormByEmpId(1L);
            logger.info(maleHealthForm);
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}