package com.learn.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TestIO06 {


    public static void main(String[] args) {
        File file = new File("/home/chyao/桌面/1.txt");

        try {
            Writer w = new FileWriter(file);
            String s = "hello world2";
            char[] data = s.toCharArray();
            w.write(data,0,data.length);
            w.flush();
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
