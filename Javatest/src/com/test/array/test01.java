package com.test.array;

public class test01 {
    public static void main(String[] args) {
        int arr01[] =new int[10];//0,1,2,3,........9
        String[] arr02;
        for(int i = 0;i<10;i++){
            arr01[i] = i;
        }
        System.out.println(arr01[0 ]);
    }
}

class User{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}