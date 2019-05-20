package com.genpus.java.OOA;

/**
 * Author:   supeng
 * Date:     2019-05-20 12:45
 * Description:  面向对测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setUsername("zhangsan");
        person.setAge(12);

        person.speak();

        Person person2 = new Person();
        person2.setUsername("lisi");
        person2.setAge(19);

        person2.speak();

        Person person3 = new Person("wangwu", 20);

        person3.speak();
    }
}