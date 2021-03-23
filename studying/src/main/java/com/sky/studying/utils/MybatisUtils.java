package com.sky.studying.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;



    static {
        try {
             //获取SqlSessionFactory对象
             String resource = "mybatis-config.xml";
             InputStream inputStream = Resources.getResourceAsStream(resource);
             sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //前面已经有了SqlSessionFactory，那么我就可以从    SqlSessionFactory中获取SqlSession实例
    //SqlSession完全包含了面向数据库执行SQL命令所需的方法
    public static SqlSession getSqlSession(){ return sqlSessionFactory.openSession(); }

}
