package com.learn.collection;

import java.util.LinkedList;

public class TestMap2 {

    LinkedList[] arr = new LinkedList[999];

    int size;

    public void put(Object key,Object value){
        SxtEntry e = new SxtEntry(key,value);
        int a = key.hashCode()%999;
        if(arr[a] == null){
            LinkedList list = new LinkedList();
            arr[a] = list;
            list.add(e);
        }else {
            arr[a].add(e);
        }
    }

    public Object get(Object key) {

        int a = key.hashCode() % 999;
        if (arr[a] != null) {
            LinkedList list = arr[a];
            for(int i=0;i<list.size();i++){
                SxtEntry e = (SxtEntry) list.get(i);
                if (e.key.equals(key)){
                    return e.value;
                }
            }

        }
        return null;
    }


    public static void main(String[] args) {
        TestMap2 tm = new TestMap2();
        tm.put("张三","李四");
        System.out.println(tm.get("张三"));



    }
}

