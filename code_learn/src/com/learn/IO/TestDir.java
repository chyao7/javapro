package com.learn.IO;

import java.io.File;

/**
 * 创建目录
 */
public class TestDir {

    public static void main(String[] args) {

        //mkdir():确保上级目录，不存在创建失败
        //mkdirs():上级目录可以不存在，一同来创建
        File dir = new File("/home/chyao/Project");
//        boolean flag = dir.mkdirs();
//        System.out.println(flag);

        /**
         *        列出下一级
         *        1ist()下级名称，一层
         *        lisFiles（) 下级对象
         *        listRoot 列出所有盘符
         */

        String[] sbnames = dir.list();
        File[] files = dir.listFiles();


        for(String name:sbnames){
            System.out.println(name);
        }
        System.out.println("****************");
        for(File file:files){
            System.out.println(file.getName());
        }
        System.out.println("****************");

        printName(dir,0);


    }

    //打印子孙目录和文件
    public static void printName(File src,int deep){

        for(int i =0 ;i<deep;i++){
            System.out.print("-");
        }

        System.out.println(src.getName());

        if (null==src||!src.exists()){
            return;
        }else if(src.isDirectory()){
            for (File s:src.listFiles()){
                printName(s,deep++);
            }
        }
    }


}
