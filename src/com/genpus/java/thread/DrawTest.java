package com.genpus.java.thread;

public class DrawTest {
    public static void main(String[] args) {
        Account account = new Account("123452345325", 1000);
        new DrawThread("取款者A ", account, 1000).start();
        new DepositThread("存款者B ", account, 800).start();
        new DepositThread("存款者C ", account, 900).start();
        new DepositThread("存款者C ", account, 600).start();
    }
}
