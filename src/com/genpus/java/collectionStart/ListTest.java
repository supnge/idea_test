package com.genpus.java.collectionStart;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    // List判断两个对象相等的标准是：只要通过equals()方法比较返回true即可。
    public static void main(String[] args) {
        List books  = new ArrayList();
        books.add("java");
        books.add("c++");
        books.add("head first c#");
        books.add("groovy");


        System.out.println(books);

        books.sort((o1, o2) -> ((String)o1).length() - ((String)o2).length());

        System.out.println(books);

    }
}

class A{
    public boolean equals(Object obj)
    {
        return true;
    }
}
