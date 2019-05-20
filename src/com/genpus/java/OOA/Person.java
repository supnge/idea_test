package com.genpus.java.OOA;

/**
 * Author:   supeng
 * Date:     2019-05-20 12:43
 * Description:  面向对象
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class Person {
    private String  username;
    private int age;

    public Person() {
    }

    public Person(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speak(){
        System.out.println("myname is :"+ username+ "  age:"+age);
    }
}