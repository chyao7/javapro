package com.learn.collection;

public class TestMap {

    SxtEntry[] arr = new SxtEntry[990];

    int size;

    public void put(Object key,Object value){
        SxtEntry e = new SxtEntry(key,value);
        arr[size++] = e;
    }

    public Object get(Object key){
        for (int i = 0;i<size;i++){
            if (arr[i].key.equals(key)){
                return arr[i].value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TestMap tm = new TestMap();
        tm.put("张三","李四");
        System.out.println(tm.get("张三"));



    }
}


class SxtEntry{

    Object key;
    Object value;

    public SxtEntry(Object key, Object value) {
        super();
        this.key = key;
        this.value = value;
    }
}