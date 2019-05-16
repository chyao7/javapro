package com.test.object;

class Person{
    int age;
    String name;

    @Override
    public String toString() {
        return "com.test.object.Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class testtostring {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 19;
        p.name = "zhao";
        System.out.println(p);
    }
}
