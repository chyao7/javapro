package com.learn.IO;

import java.io.*;

public class TestIO05 {

    public static void main(String[] args) {
        File src = new File("/home/chyao/桌面/1.txt");

        Reader reader;

        {
            try {

                reader = new FileReader(src);
                char[] flush = new char[1024];
                int len = -1;
                while ((len=reader.read(flush))!=-1){
                    String s = new String(flush,0,len);
                    System.out.println(s);
                }
                reader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
