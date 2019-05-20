package com.genpus.java.thread;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread {
    private BlockingQueue<String> bq;

    public Consumer(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {

        while (true) {
            try {
                System.out.println(getName() + " 进行消费");
                bq.take();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "消费完成 " + bq);
        }
    }
}
