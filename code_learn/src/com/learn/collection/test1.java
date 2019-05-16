package com.learn.collection;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        System.out.println("请输入月份：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result;
        result = solve(n);
        System.out.println(result);
    }

    public static int solve(int a){

        if(a==1|a==2){
            return 1;
        }else {
            return solve(a-1)+solve(a-2);
        }

    }
}
