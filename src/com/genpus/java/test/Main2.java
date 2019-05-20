package com.genpus.java.test;

class Thread2 implements Runnable{
    private String name;
    public Thread2(String name)
    {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0; i<4; i++)
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
public class Main2{
    public static void main(String[] args) {
        Thread2 th3 = new Thread2("C");
        Thread2 th4 = new Thread2("D");
        new Thread(th3).start();
        new Thread(th4).start();
    }
}
