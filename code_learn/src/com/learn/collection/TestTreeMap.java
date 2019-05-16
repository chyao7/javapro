package com.learn.collection;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

    public static void main(String[] args) {

        Map<String,String> map = new TreeMap<>();
        map.put("a","b");
        map.put("z","l");
        map.put("v","k");

        for(String k:map.keySet()){
            System.out.println(map.get(k));
        }

        Map<Employee,String>  map2 = new TreeMap<>();
        map2.put(new Employee(100,"张三",2000), "男试试");
        map2.put(new Employee(101,"张四",3000), "ssa");
        map2.put(new Employee(102,"张无",4000), "打啊");
        System.out.println(map2);

        for(Employee key:map2.keySet()){

            System.out.println(key+":"+map2.get(key));
        }
    }
}


