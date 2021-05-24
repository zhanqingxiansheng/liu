package com.liuwork.framework.threadpoolserver.Service.impl;

import com.liuwork.framework.threadpoolserver.Service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @ClassName AsyncServiceImpl
 * @Author liuzhihao
 * @Description
 * @Date 2021/4/15 21:12
 * @Version 1.0.0
 */
@Service
public class AsyncServiceImpl implements AsyncService {
    private static final Logger logger = LoggerFactory.getLogger(AsyncServiceImpl.class);
    @Async("asyncServiceExecutor")
    @Override
    public void executeAsync(){
        logger.info("start executeAsync");
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        logger.info("end executeAsync");
    }
}
