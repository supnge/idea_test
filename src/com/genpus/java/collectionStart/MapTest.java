package com.genpus.java.collectionStart;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("java" , 11);
        map.put("javaScript", 12);
        map.put("C++", 13);
        map.put("groovy", 14);

         Set<Map.Entry> entry =  map.entrySet();

         for(Map.Entry en : entry)
         {
             System.out.println(en.getKey() + "---->>>>"+ en.getValue());
         }

         // 1.8 新添加的一些方法
        map.replace("java", 19);

        System.out.println(map);

        map.merge("C++", 10, (oldVal, param)-> (Integer)oldVal + (Integer)param);

        System.out.println(map);

        map.computeIfAbsent("C#",  (param)-> ((String)param).length());

        System.out.println(map);

        map.computeIfPresent("C++", (oldVal, param)-> (Integer)param + (Integer)param);
        System.out.println(map);

    }
}
