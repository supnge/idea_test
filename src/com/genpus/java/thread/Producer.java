package com.genpus.java.thread;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread {
    private BlockingQueue<String> bq;

    public Producer (BlockingQueue bq)
    {
        this.bq = bq;
    }

    @Override
    public void run() {
        String[] array= {"java ", "php", "python"};

        for(int i=0; i <99999; i++)
        {
            System.out.println(getName()+ " 生产者准备生产 ");
            try
            {
                Thread.sleep(200);
                bq.put(array[i%3]);
            }catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.println(getName() + " 生产完成 " + bq);
        }
    }
}
