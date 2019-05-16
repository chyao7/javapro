package com.learn.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 随机读取和写入流
 */
public class TestRandomAcessFile {

    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile(new File("src/com/learn/IO/TestFile.java"), "r");
            //从第二个位置开始
            raf.seek(2);

            byte[] flush = new byte[1024];
            int len = -1;
            while ((len=raf.read(flush))!=-1){
                System.out.println(new String(flush,0,len));

            }

            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
