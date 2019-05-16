package com.learn.IO;

import java.io.*;

/**
 * 图片读取到数组中
 * 字节数据写出到文件
 */

public class TestIO09 {
    public static void main(String[] args) {

        byte[] data = fileTOByteArray("/home/chyao/桌面/1.jpg");
        ByteArrayTofile(data,"/home/chyao/桌面/1.2pg");
    }

    public static byte[] fileTOByteArray(String filepath){

        File src= new File(filepath);
        try {
            FileInputStream is = new FileInputStream(src);
            ByteArrayOutputStream bot = new ByteArrayOutputStream();

            byte[] flush = new byte[1024];
            int len = -1;
            while ((len=is.read(flush))!=-1){
                bot.write(flush,0,len);
            }
            bot.flush();
            is.close();
            return bot.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void ByteArrayTofile(byte[] b ,String filepath){

        File src = new File(filepath);
        try {
            OutputStream os = new FileOutputStream(src);
            InputStream is = new ByteArrayInputStream(b);

            byte[] flush = new byte[1024];
            int len = -1;
            while ((len=is.read(flush))!=-1){
                os.write(flush);
            }
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
