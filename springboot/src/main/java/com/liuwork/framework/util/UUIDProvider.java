package com.liuwork.framework.util;
import java.util.UUID;
/**
 * @ClassName UUIDProvider
 * @Author liuzhihao
 * @Description
 * @Date 2021/3/16 2:59
 * @Version 1.0.0
 */

public class UUIDProvider {
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }

    public static void main(String[] args) {
        //利用伪随机数生产版本为4，变体为9的UUID
        System.out.println(UUID.randomUUID());

        //对于相同的命名空间总是生产系统的UUID,版本为3，变体为9
        //命名空间为“mwq”使生成的UUID总是为06523e4a-9a66-3687-9334-e41dab27cef4
        System.out.println(UUID.nameUUIDFromBytes("mwq".getBytes()));
    }
}
