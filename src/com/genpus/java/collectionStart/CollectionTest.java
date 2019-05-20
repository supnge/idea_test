package com.genpus.java.collectionStart;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("china");
        System.out.println("c 集合对应的元素个数为："+ c.size());
        c.add(6);
        System.out.println("c 集合对应的元素个数为：" + c.size());
        c.remove(6);
        System.out.println("c 集合对应的元素个数为："+ c.size());

        System.out.println("if contains :china" + c.contains("china"));

        c.add("java");
        Collection books = new ArrayList();
        books.add("java");
        books.add("c++");
        books.add("groovy");

        System.out.println("books collection has :" + books);
        System.out.println("two collection if equals :"  + c.containsAll(books));

        books.removeAll(c);

        System.out.println("books collection has :" + books);

        books.retainAll(c);
        System.out.println("books collection has :" + books);

        c.clear();
        System.out.println("c collection has :" + c);



        books.add("Java EE");
        books.add("Java");
        books.add("Android");
        books.add("Groovy");
        books.add("C++");


        // 获取books集合对应的迭代器
        Iterator it = books.iterator();
        // 使用Lambda表达式（目标类型是Comsumer）来遍历集合元素
        books.forEach(obj -> System.out.println("collection books is : "+ obj));
        it.forEachRemaining(obj -> System.out.println("迭代集合元素：" + obj));

        Predicate<String> predicate = (s) -> s.startsWith("A");
        books.removeIf(predicate);
        books.forEach(obj -> System.out.println("collection books is : "+ obj));

        //使用流式方法操作：
        System.out.println(books.stream().filter(ele -> ((String)ele).contains("Java")).count());

        //统计每个的长度
        //先转换为Stream  用里面的方法
        books.stream().mapToInt(ele -> ((String)ele).length()).forEach(System.out::println);

        books.forEach(System.out::println);
    }
}

