package com.genpus.java.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// 使用BlockArray实现生产者消费者
public class BlockArrayTest {
    public static void main(String[] args) {
        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(2);
        // 启动三个生产者
        new Producer(bq).start();
        new Producer(bq).start();
        new Producer(bq).start();
        // 启动二个生产者
        new Consumer(bq).start();
        new Consumer(bq).start();
    }
}
