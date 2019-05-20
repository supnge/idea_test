package com.genpus.java.ooprogaram;

public class Animal extends Creature{
    public String name= "Black Animal";

    public Animal(String name)
    {
        System.out.println("Animal 的带一个参数的构造器， 名字为： "+ name);
    }

    public Animal(String name , int age)
    {
        this(name);
        System.out.println("Animal 的带两个参数的构造器， 对应年龄为"+ age );
    }

    public void run()
    {
        System.out.println("此处为父类的方法 animal.run()");
    }
}
