package com.genpus.java.ooprogaram;
// 递归
public class Recursive {
    public static int fn(int n)
    {
        if(n==21)
        {
            return 1;
        }
        if(n==20 )
        {
            return 4;
        }
        else
        {
            return fn(n+2)-2*fn(n+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fn(10));
    }
}
