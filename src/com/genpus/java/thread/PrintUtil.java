package com.genpus.java.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintUtil {

    private boolean flag = false;

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void printChacter() {

        Character[] characters = new Character[26];
        for (Character c = 'A', i = 0; c <= 'Z'; i++, c++) {
            characters[i] = c;
        }

        for (int i = 0; i <= characters.length; ) {
            lock.lock(); // 此处加锁，应该放到循环开始处
            try {
                if (flag) {
                    System.out.print(characters[i]);
                    flag = false;
                    i++;
                    condition.signalAll();
                } else {
                    condition.await();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public void printNum() {

        for (int i = 1; i <= 52; ) {
            lock.lock(); // 此处加锁，应该放到循环开始处
            try {
                if (!flag) {
                    System.out.print(i + "" + (i + 1));
                    i = i + 2;
                    flag = true;
                    condition.signalAll();
                } else {
                    condition.await();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
