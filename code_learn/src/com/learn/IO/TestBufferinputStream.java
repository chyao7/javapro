package com.learn.IO;

import java.io.*;

public class TestBufferinputStream {
    public static void main(String[] args) {
        File file = new File("/home/chyao/桌面/1.txt");
        try (BufferedInputStream is = new BufferedInputStream(new FileInputStream(file))) {
            byte[] flush = new byte[10];
            int len = -1;
            while ((len=is.read(flush))!=-1){
                System.out.println(new String(flush));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
