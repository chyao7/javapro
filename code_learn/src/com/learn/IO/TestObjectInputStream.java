package com.learn.IO;


/**
 * 需要接口Serializable
 * 对象序列化与反序列化
 *
 */

import java.io.*;

public class TestObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ObjectOutputStream dos = new ObjectOutputStream(os);

        dos.writeObject("aaaa");
        dos.flush();

        byte[] datas = os.toByteArray();


        ObjectInputStream dis = new ObjectInputStream(new ByteArrayInputStream(datas));

        System.out.println(dis.readObject());
    }
}
