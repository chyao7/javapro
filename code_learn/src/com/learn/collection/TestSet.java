package com.learn.collection;

import java.util.HashMap;


public class TestSet {

//    Set  set = new HashSet();


    HashMap map;

    private static  final Object Present = new Object();

    public TestSet(){
        map = new HashMap();
    }

    public void add(Object o){
        map.put(o,Present);

    }


    public int size(){
        return map.size();
    }

    public static void main(String[] args) {
        TestSet testSet = new TestSet();
        testSet.add("aaa");
        testSet.add(new String("aaa"));
        System.out.println(testSet);

    }
}
