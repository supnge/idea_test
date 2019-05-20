package com.genpus.java.thread;

// 打印数字
public class ThreadPrintNum extends Thread {

    PrintUtil pu = new PrintUtil();

    public ThreadPrintNum(PrintUtil pu)
    {
        this.pu = pu;
    }

    @Override
    public void run() {
        pu.printNum();
    }
}
