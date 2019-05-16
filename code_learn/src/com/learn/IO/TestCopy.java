package com.learn.IO;

import java.io.*;

public class TestCopy {


    public static void main(String[] args) {
        File src = new File("/home/chyao/桌面/1.jpg");//源头
        System.out.println(src.getName());
        File dest = new File("/home/chyao/桌面/2.jpg");//目的地

        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);
            byte[] flush = new byte[1024*1024];
            int len =-1;
            while ((len=is.read(flush))!=-1){
                System.out.println(flush);
                os.write(flush,0,len);
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //先打开的后关闭

        try {
            os.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
