package com.learn.IO;

import java.io.UnsupportedEncodingException;

public class TestContentEncode {


    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg="中国";
        byte[] data = msg.getBytes();
        System.out.println(data.length);


        //编码
        data = msg.getBytes("GBK");
        System.out.println(data.length);

        //解码
        msg = new String(data,0,data.length,"GBK");
        String msg2 = new String(data);
        System.out.println(msg);
        System.out.println(msg2);
    }

}
