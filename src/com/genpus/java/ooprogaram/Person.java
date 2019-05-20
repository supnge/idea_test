package com.genpus.java.ooprogaram;

public class Person {
    private String name;
    private String idStr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }
    public Person(){}
    public Person(String name, String idStr)
    {this.name = name;
    this.idStr = idStr;}

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
        {
            return true;
        }
        if(obj !=null && obj.getClass() ==Person.class)
        {
            Person personObj = (Person)obj;
            if(this.getIdStr().equals(personObj.getIdStr()))
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Person person = new Person("鄢陵", "12313123123");
        Person person2 = new Person("鄢陵王", "12313123123");
        Person person3 = new Person("鄢陵玉", "1231312");

        System.out.println(person.equals(person2));
        System.out.println(person.equals(person3));
    }
}
