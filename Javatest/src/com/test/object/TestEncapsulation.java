package com.test.object;

public class TestEncapsulation {
    public static void main(String[] args) {

        Human h = new Human();
        TestPrivate t = new TestPrivate();
        t.setAge(14);

    }
}


class Human{
    private int age;
    String name;

    void sayAge(){
        System.out.println(age);
    }
}

class Boy extends Human{
    void sayHello(){
        System.out.println();
    }
}