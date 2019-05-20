package com.genpus.java.thread;

// 打印字母
public class ThreadPrintChacter extends Thread {

    PrintUtil pu = new PrintUtil();

    public ThreadPrintChacter(PrintUtil pu)
    {
        this.pu = pu;
    }

    @Override
    public void run() {
        pu.printChacter();
    }
}
