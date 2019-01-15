package com.learn.mybatis.mapper;

import com.learn.mybatis.pojo.Task;
import com.learn.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskMapperTest {

    private Logger logger = Logger.getLogger(TaskMapperTest.class);

    @Test
    public void findTaskById() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.openSession();
            TaskMapper taskMapper = sqlSession.getMapper(TaskMapper.class);
            Task task = taskMapper.findTaskById(1L);
            logger.info(task);
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