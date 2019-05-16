package com.learn.IO;

import java.io.*;

/**
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.关闭
 */

public class TetsIO01 {

    public static void main(String[] args) {
        File src = new File("/home/chyao/桌面/1.txt");

        InputStream is;

        {
            try {
                is = new FileInputStream(src);

                int temp;

                while ((temp=is.read())!=-1){
                    System.out.println((char) temp);
                }

//                int data1 = is.read();
//                int data2 = is.read();
//                int data3 = is.read();
//                int data4 = is.read();
//                System.out.println((char) data1);
//                System.out.println((char) data2);
//                System.out.println((char) data3);
//                System.out.println((char) data4);//不是数据返回-1
                is.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
