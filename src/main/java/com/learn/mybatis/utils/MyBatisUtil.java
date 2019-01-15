package com.learn.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Description: MyBatis Util, create SqlSession instance
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/15 10:18
 * @version : 1.0
 */
public class MyBatisUtil {
    private static final Class<MyBatisUtil> LOCK = MyBatisUtil.class;

    private static SqlSessionFactory factory = null;

    private MyBatisUtil() { }

    private static SqlSessionFactory getFactory() {
        if (factory == null) {
            synchronized (LOCK) {
                if (factory == null) {
                    try {
                        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
                        factory = new SqlSessionFactoryBuilder().build(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return factory;
    }

    public static SqlSession openSession() {
        if (factory == null) {
            factory = getFactory();
        }
        return factory.openSession();
    }
}
