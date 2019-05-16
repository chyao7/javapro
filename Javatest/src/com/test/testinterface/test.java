package com.test.testinterface;

public class test {
    public static void main(String[] args) {
        Myclass intface = new Myclass();
        intface.test01();
        int k;
        k = intface.test02(3,5);
        System.out.println(k);
    }
}
