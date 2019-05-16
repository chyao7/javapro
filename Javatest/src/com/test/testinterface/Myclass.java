package com.test.testinterface;

import static com.test.testinterface.Myinterface.MAX_GRADE;

public class Myclass implements Myinterface {
    @Override
    public void test01() {
        System.out.println(MAX_GRADE);
    }

    @Override
    public int test02(int a, int b) {
        return a+b;
    }
}
