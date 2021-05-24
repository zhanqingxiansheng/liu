package com.liuwork.framework.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName MybatisUtil
 * @Author liuzhihao
 * @Description
 * @Date 2021/5/19 18:15
 * @Version 1.0.0
 */
//Mybatis工具类用来获取sqlSessionFactory -> sqlSession
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    //获取sqlSessionFactory
    static {
        try {
            String resource = "/mybatis/mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
