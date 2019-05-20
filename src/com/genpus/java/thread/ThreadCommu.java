package com.genpus.java.thread;

// 使用线程通信打印两个线程，一个线程存1~52  另外一个存A~Z 打印顺序为： 12A34B56C
// 判断，当第一个线程 %2 ==0 的时候，通知第二个线程进行打印 否则，继续打印
public class ThreadCommu {
    public static void main(String[] args) {
        PrintUtil pu = new PrintUtil();
        ThreadPrintChacter tpc = new ThreadPrintChacter(pu);
        ThreadPrintNum tpn = new ThreadPrintNum(pu);

        tpc.start();
        tpn.start();


    }
}
