package com.genpus.java.OOA;

/**
 * Author:   supeng
 * Date:     2019-05-20 14:55
 * Description:  猫狗案例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class AniminalDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.catchMouse();
        Dog dog = new Dog();
        dog.lookHome();
    }
}
class Animal{
    String color;
    int legs;

    public void eat(){
        System.out.println("eat。。。");
    }
}
class Cat extends Animal{
    public void catchMouse(){
        System.out.println("catchMouse。。。");
    }
}
class Dog extends Animal{
    public void lookHome(){
        System.out.println("lookHome。。。");
    }
}