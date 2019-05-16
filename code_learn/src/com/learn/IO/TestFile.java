package com.learn.IO;

import java.io.File;
import java.io.IOException;

public class TestFile {

    public static void main(String[] args) {
        File src = new File("/home/chyao/桌面/1.txt");
        //文件信息
        System.out.println(src.getAbsoluteFile());
        System.out.println(src.getAbsolutePath());
        System.out.println(src.getPath());
        System.out.println(src.getName());
        //文件状态
        System.out.println(src.exists());
        System.out.println(src.isFile());
        System.out.println(src.isDirectory());
        //
        System.out.println(src.length());

        /**
         * 创建file：不存在才创建
         */

        File f = new File("/home/chyao/桌面/2.txt");
        boolean flag = false;
        try {
            flag = f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(flag);
        //删除已经存在的文件
        boolean flag2 = f.delete();
        System.out.println(flag2);
    }
}
