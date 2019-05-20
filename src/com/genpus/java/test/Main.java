package com.genpus.java.test;

class Thread1 extends Thread{
    private String name;
    public Thread1(String name)
    {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++)
        {
            System.out.println(name + "运行： "+ i);
            try {
                Thread.sleep((int)Math.random()*10 );
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class Main{
    public static void main(String[] args) {
        Thread1 th1 = new Thread1("A");
        Thread1 th2 = new Thread1("B");
        th1.start();
        th2.start();
    }
}
