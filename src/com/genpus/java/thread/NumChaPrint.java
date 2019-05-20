package com.genpus.java.thread;

// 此处使用了对象锁
/*
* 1、创建两个线程实现Runnable接口重写run方法，一个用于打印数字，一个用于打印字母。

2、创建一个测试类，在测试类中创建一个Object类的对象（作为两个线程的共享资源，以便实现线程间的通信），通过各类的构造方法传递过去。

3、在两个类的run方法中都要用synchronized保证同步，即加锁。

4、在数字类中用for循环每打印两个数字就唤醒其他线程，释放锁，进入阻塞状态。

     在字母类中每打印一个字母就唤醒其他线程，释放锁，进入阻塞状态。

在写这个程序的时候有几点要注意的地方：

1、两个线程要使用同一个资源才需相互通信，所以在测试类中创建共享资源，并通过构造方法分别传到各线程类中。

2、两个线程哪个先运行（执行start（））哪个就先获得资源并执行

3、在run方法体内写进程间的通信wait（）和notifyall（）时，一定要先写notifyall（）再写wait（）。

    原因：当你先写wait()时，本进程也进入休眠状态，再写notifyall（）唤醒所有线程时本线程以及其他线程被一块唤醒，竞争同一个资源，就会造成死锁。

             所以一定要先唤醒其他线程，再让本线程阻塞！*/
public class NumChaPrint {

    public static void main(String[] args) {
        Object object = new Object();
        Shuzi sz = new Shuzi(object);
        Zimu zm = new Zimu(object);

        new Thread(zm).start();
        new Thread(sz).start();

    }

}

class Shuzi implements Runnable {
    public Object obj;

    public Shuzi(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj) {
            for (int i = 1; i <= 52; i++) {
                try {

                    System.out.print(i);
                    if (i % 2 == 0) {
                        obj.notifyAll();
                        obj.wait();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Zimu implements Runnable {
    public Object obj;

    public Zimu(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        Character[] characters = new Character[26];
        for (Character c = 'A', i = 0; c <= 'Z'; i++, c++) {
            characters[i] = c;
        }
        synchronized (obj) {
            for(int i = 0; i < characters.length; i++)
            {
                try {
                    System.out.print(characters[i]);
                    obj.notifyAll();
                    obj.wait();
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }

        }
    }
}