package com.liuwork.dao;

import com.liuwork.framework.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName UserMangerDaoTest
 * @Author liuzhihao
 * @Description
 * @Date 2021/5/20 9:50
 * @Version 1.0.0
 */

public class UserMangerDaoTest {
    @Test
    public void test(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //方式一：getMapper
        UserManagerDao userManagerDao = sqlSession.getMapper(UserManagerDao.class);
        List<UserManagerDao> userManagerDaoList = userManagerDao.getUserManagerDaoList();
        for (UserManagerDao userManagerDao1 : userManagerDaoList){
            System.out.println(userManagerDao1);
        }
    }
}
