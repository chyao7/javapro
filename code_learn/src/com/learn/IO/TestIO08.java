package com.learn.IO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class TestIO08 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        String s = "hello world";
        bos.write(s.getBytes(),0,s.getBytes().length);
        bos.flush();
        byte[] b = bos.toByteArray();
        System.out.println(new String(b,0,b.length));
    }
}
