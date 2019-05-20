package com.genpus.java.ooprogaram;

public class Varargs {
    // 多个变量
    public static void printout(int num, String ... strn)
    {
        for(String str: strn)
        {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        printout(3, "java", "Python", "Groovy");
    }

}
