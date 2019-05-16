package com.learn.IO;

import java.io.*;

public class TestBufferReader {
    public static void main(String[] args) {

        File file = new File("/home/chyao/桌面/1.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String msg;
            while ((msg=reader.readLine())!=null){
                System.out.println(msg);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
