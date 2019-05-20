package com.genpus.java.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// 传统的线程通信 使用旗标的变化进行判断
// 类实现存和取，不能连续取，不能连续存
public class Account {
    private String accountNo;
    private double balance;
    private boolean flag = false;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    // 余额不能随便取，所以只能取，不能设置
    public double getBalance() {
        return balance;
    }

    public Account(String accountNo, double balance)
    {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    /*public synchronized void draw(double drawAmount) {
        // 判断，如果falag = false 则等待，如果为true 则取钱
        try {
            if (!flag)
                this.wait();
            else {
                if(balance >= drawAmount)
                {
                    // 取钱
                    System.out.println(Thread.currentThread().getName() + " 取钱： " + drawAmount );
                    balance -= drawAmount;
                    System.out.println("取钱后余额为：　" + getBalance());
                    flag = false;
                    notifyAll();
                }
                else {
                    System.out.println(Thread.currentThread().getName() + " 取钱失败，进入等待状态 " );
                    flag = false;
                    notifyAll();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void deposit(double depositAmount) {
        // 判断与取钱相反
        try
        {
            if(flag)
            {
                this.wait();
            }
            else
            {
                // 存钱
                System.out.println(Thread.currentThread().getName() + "存钱： " + depositAmount);
                balance += depositAmount;
                System.out.println("存钱后，余额为： "+ getBalance());

                flag = true;
                notifyAll();
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }*/

    // 此处进行改写，使用Condition进行：

    final Lock lock = new ReentrantLock();
    final Condition condition = lock.newCondition();

    public void draw(double drawAmount) {
        // 判断，如果falag = false 则等待，如果为true 则取钱
        lock.lock();

        try {
            if (!flag)
                condition.await();
            else {
                if(balance >= drawAmount)
                {
                    // 取钱
                    System.out.println(Thread.currentThread().getName() + " 取钱： " + drawAmount );
                    balance -= drawAmount;
                    System.out.println("取钱后余额为：　" + getBalance());
                    flag = false;
                    condition.signalAll();
                }
                else {
                    System.out.println(Thread.currentThread().getName() + " 取钱失败，进入等待状态 " );
                    flag = false;
                    condition.signalAll();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        finally {
            lock.unlock();
        }
    }

    public void deposit(double depositAmount) {
        // 判断与取钱相反
        lock.lock();
        try
        {
            if(flag)
            {
                condition.await();
            }
            else
            {
                // 存钱
                System.out.println(Thread.currentThread().getName() + "存钱： " + depositAmount);
                balance += depositAmount;
                System.out.println("存钱后，余额为： "+ getBalance());

                flag = true;
                condition.signalAll();
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }



}
