package com.learn.IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestIO07 {

    public static void main(String[] args) throws IOException {
        String msg = "hello world";

        InputStream is = new ByteArrayInputStream(msg.getBytes());

        byte[] data = new byte[1];

        int len = -1;

        while ((len=is.read(data))!=-1){
            String s = new String(data,0,len);
            System.out.println(s);
        }
    }
}
