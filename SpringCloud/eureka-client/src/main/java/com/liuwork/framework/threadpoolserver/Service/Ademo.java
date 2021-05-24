package com.liuwork.framework.threadpoolserver.Service;

import org.springframework.stereotype.Service;

/**
 * @ClassName Ademo
 * @Author liuzhihao
 * @Description
 * @Date 2021/4/22 2:55
 * @Version 1.0.0
 */
@Service
public class Ademo {
    public Ademo(B b){ }
}
@Service
class B{
    public B(C c){ }
}
@Service
class C{
    public C(Ademo ademo){}
}
