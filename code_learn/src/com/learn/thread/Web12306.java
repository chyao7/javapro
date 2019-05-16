package com.learn.thread;

/**
 * 并发（线程安全）
 */

public class Web12306 extends Thread {

    private int nums = 99;

    @Override
    public void run() {
        while (true) {
            if (nums < 0) {
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->"+nums--);
        }
    }

    public static void main(String[] args) {
        Web12306 web12306 = new Web12306();
        new Thread(web12306,"aa").start();
        new Thread(web12306,"bb").start();
        new Thread(web12306,"cc").start();

    }
}
