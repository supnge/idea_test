package com.genpus.java.ooprogaram;

public class Wolf extends Animal {

    public void run()
    {
        System.out.println("此处为子类覆盖父类的方法 wolf.run()");
    }

    public Wolf()
    {
        super("兔子", 10);
        System.out.println("Wolf 无参数的构造器");
    }
    public static void main(String[] args)
    {
        Animal animal = new Wolf();
        System.out.println(animal.name);
        animal.run();

    }
}
