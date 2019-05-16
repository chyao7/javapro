package com.learn.thread;

public class TestRacer implements Runnable{
    private String winner;

    @Override
    public void run() {
        for(int i =1; i<=100;i++){

            if(Thread.currentThread().getName().equals("aa")&&i%10==0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"-->"+i);
            boolean flag =gameover(i);
            if(flag){
                break;
            }
        }
    }

    private boolean gameover(int steps){

        if(winner !=null){
            return true;
        }else {
            if(steps==100){
                winner = Thread.currentThread().getName();
                System.out.println("winner is "+winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TestRacer testRacer = new TestRacer();
        new Thread(testRacer,"aa").start();
        new Thread(testRacer,"bb").start();

    }
}
