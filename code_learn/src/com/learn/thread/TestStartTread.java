package com.learn.thread;

/**
 * 创建线程
 * 重写run
 *
 */

public class TestStartTread extends Thread{

    @Override
    public void run() {
        for(int i=0; i<120; i++){
            System.out.println("听歌");
        }
    }

    public static void main(String[] args) {
        TestStartTread testStartTread = new TestStartTread();

        //start重开一个线程
        //testStartTread.start();
        testStartTread.run();
        for(int i =0;i<120;i++){
            System.out.println("coding");
        }
    }
}
