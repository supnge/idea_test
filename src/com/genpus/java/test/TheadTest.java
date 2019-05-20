package com.genpus.java.test;


public class TheadTest {
    public static void main(String[] args) {
        Consumer ct = new Consumer("101", 5000);
        Consumer ct2 = new Consumer("102", 3000);
        Consumer ct3 = new Consumer("103", 6000);
        Consumer ct4 = new Consumer("104", 2000);
        Waiter wt = new Waiter();

        wt.setDaemon(true);
        ct.start();
        ct2.start();
        ct3.start();
        ct4.start();
        wt.start();

        System.out.println("一天结束！！！");


    }
}
class Consumer extends Thread
{
    private String no;
    private int times;

    public Consumer (String no, int times)
    {
        this.no = no;
        this.times = times;
    }

    @Override
    public void run() {
        System.out.println(no + ": 包厢开始唱歌！！！");
        try {
            Thread.sleep(times);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(no + ": 包厢唱歌结束，花费时间为： " + times);
    }
}
class Waiter extends Thread
{
    @Override
    public void run() {
        while(true)
        {
            System.out.println(new java.util.Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}