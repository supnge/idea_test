package com.genpus.java.test;

public class ThreadWait implements Runnable {
    // 三部分，第一个区别其它类，第二个为前一项，第三个为自身对象
    private String name;
    private Object prev;
    private Object self;

    private ThreadWait(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
        int count = 10;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.print(name);
                    count--;
                    self.notify();
                }
                try {
                    prev.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args){
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();

        ThreadWait twa = new ThreadWait("A", c, a);
        ThreadWait twb = new ThreadWait("B", a, b);
        ThreadWait twc = new ThreadWait("C", b, c);
        Thread ttwa = new Thread(twa);
        Thread ttwb = new Thread(twb);
        Thread ttwc = new Thread(twb);
//        DaemonThread dt = new DaemonThread();
//
//        dt.setDaemon(true);
//        dt.start();
        try {

            ttwa.start();
            Thread.sleep(1000);
            ttwb.start();
            Thread.sleep(1000);
            ttwc.start();
            Thread.sleep(1000);
        }catch
                (Exception e)
        {
            e.printStackTrace();
        }


    }
}
class DaemonThread extends Thread{
    @Override
    public void run() {
        for(int i=0 ; ; i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
