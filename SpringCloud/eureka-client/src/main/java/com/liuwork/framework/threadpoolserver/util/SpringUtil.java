package com.liuwork.framework.threadpoolserver.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanExpressionException;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.*;
/**
 * @ClassName SpringUtil
 * @Author liuzhihao
 * @Description
 * @Date 2021/4/24 21:41
 * @Version 1.0.0
 */
@Component
public class SpringUtil {
    private static final Logger log = LoggerFactory.getLogger(SpringUtil.class);

    /**
     * 字符集UTF-8
     */
    public static final String CHARSET_UTF8 = "UTF-8";
    /**
     * 字符集GBK
     */
    public static final String CHARSET_GBK = "GBK";
    /**
     * 字符集gb2312
     */
    public static final String CHARSET_GB2312 = "gb2312";
    private static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeanExpressionException{
        if (SpringUtil.applicationContext == null){
            SpringUtil.applicationContext = applicationContext;
        }
        System.out.println("---------------------");
        System.out.println("liuwork.framework.theadpoolserver");
        System.out.println("ApplicationContext配置成功，在普通类中可以调用SpringUtils" +
                ".getApplicationContext方法");
    }
    //获取applicationContext
    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }
    //通过name获取 Bean.
    public static Object getBean(String name){
        return getApplicationContext().getBean(name);
    }

    //通过class获取Bean.
    public static <T> T getBean(Class<T> clazz){
        return getApplicationContext().getBean(clazz);
    }

    //通过name,以及Clazz返回指定的Bean
    public static <T> T getBean(String name,Class<T> clazz){
        return getApplicationContext().getBean(name, clazz);
    }

}

