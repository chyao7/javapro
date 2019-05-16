package com.learn.IO;

import java.io.*;

/**
 * 文件字节输出流
 *  1.创建源
 *  2.选择流
 *  3.操作
 *  4.释放资源
 */
public class TestIO03 {

    public static void main(String[] args) {

        //创建源
        File src = new File("/home/chyao/桌面/3.txt");

        //选择流
        try {
            OutputStream os = new FileOutputStream(src,true);//append

            //操作
            String msg = "hello world";

            byte[] datas = msg.getBytes();

            os.write(datas,0,datas.length);

            os.flush();

            os.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
