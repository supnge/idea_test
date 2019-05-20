package com.genpus.java.ooprogaram;

public class SubBase extends Base{
    public String color;
    public SubBase(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public static void main(String[] args) {
        SubBase sb = new SubBase("Java ", 16, "Red");

        System.out.println(sb.name+"color: "+ sb.color+" age: "+ sb.age);
    }
}
