package com.learn.IO;

import java.io.*;

/**
 * DataInputStream
 * * DataOutputStream
 * 保留字符格式
 */

public class TestDataInputStream {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        dos.writeUTF("难受");
        dos.write(1);
        dos.writeChar('a');
        dos.flush();

        byte[] datas = os.toByteArray();


        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(datas));
        System.out.println(dis.readUTF());
        System.out.println(dis.read());
        System.out.println(dis.readChar());







    }
}
