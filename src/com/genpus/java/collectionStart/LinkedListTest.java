package com.genpus.java.collectionStart;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList books = new LinkedList();
        // 尾部
        books.offer("Java");
        // 顶部
        books.push("C++");
        // 顶部
        books.offerFirst("Groovy");
        // 添加  Appends the specified element to the end of this list
        books.add("R language");

        Iterator it = books.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 对第一个元素进行出栈
        System.out.println("pop " + books.pop());
        Iterator it2 = books.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        System.out.println(books.peekFirst());
        System.out.println(books.peekLast());
        // Retrieves, but does not remove, the head (first element) of this list
        System.out.println(books.peek());
        System.out.println(books.size());

        System.out.println("===========pollFirst==========");
        it2 = books.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
//        Retrieves and removes the first element of this list,
//     or returns {@code null} if this list is empty
        System.out.println("books.pollFirst() : " + books.pollFirst());
        it2 = books.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

    }
}
