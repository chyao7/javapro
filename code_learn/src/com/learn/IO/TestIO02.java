package com.learn.IO;

import java.io.*;

/**分段读取
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.关闭
 */

public class TestIO02 {

    public static void main(String[] args) {
        File src = new File("/home/chyao/桌面/1.txt");

        try {
            InputStream is = new FileInputStream(src);
            byte[] flush = new byte[3];
            int len = -1;
            while((len=is.read(flush))!=-1) {

                String str = new String(flush,0,len);
                System.out.println(str);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

