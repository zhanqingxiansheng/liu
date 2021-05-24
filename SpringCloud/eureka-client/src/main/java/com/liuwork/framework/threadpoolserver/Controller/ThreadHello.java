package com.liuwork.framework.threadpoolserver.Controller;

import com.liuwork.framework.threadpoolserver.Service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ThreadHello
 * @Author liuzhihao
 * @Description
 * @Date 2021/4/15 21:17
 * @Version 1.0.0
 */
@RestController
public class ThreadHello {
    private static final Logger logger = LoggerFactory.getLogger(ThreadHello.class);

    @Autowired
    private AsyncService asyncService;
    @RequestMapping("/")
    public String submit(){
        logger.info("start submit");
        //调用service层的任务
        asyncService.executeAsync();
        logger.info("end submit");
        return "success";
    }
}
