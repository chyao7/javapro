package com.learn.IO;

import java.io.*;

/**
 * 转换流
 * 字节流与字符流的转换
 * InputStreamReader
 * OutputStreamReader
 *
 * 以字符流的形式处理字节流
 * 指定字符集，解决乱码
 *
 */
public class TsstInputStreamReader {

    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in ,"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String msf ="";
        while (!msf.equals("exit")){
            try {
                msf = reader.readLine();
                writer.write(msf);
                writer.newLine();
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
