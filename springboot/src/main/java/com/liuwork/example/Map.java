package com.liuwork.example;

import java.util.*;
/**
 * @ClassName Map
 * @Author liuzhihao
 * @Description
 * @Date 2021/5/21 20:42
 * @Version 1.0.0
 */

public class Map {
    public static void main(String[] args) {
        HashMap<String,String> hMap = new HashMap<String,String>();
        hMap.put("1","1at");
        hMap.put("2","2l");
        hMap.put("3","3la");
        Collection c = hMap.values();
        Iterator d = c.iterator();
        while(d.hasNext()){
            System.out.println(d.next());
        }
       
        System.out.println("");
    }
}
