package com.learn.collection;

/**
 * 测试泛型
 */
public class TestCollection {

    public static void main(String[] args) {
        Mycollection<String> mycollection = new Mycollection<String>();
        mycollection.set("aaa",0);
        mycollection.set("bbb",1);


    }



}


class Mycollection<E>{
    Object[] objects = new Object[5];

    public void set(E obj,int index){
        objects[index] = obj;
    }


    public E get(int index){
        return (E) objects[index];
    }
}
