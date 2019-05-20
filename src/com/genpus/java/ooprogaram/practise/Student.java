package com.genpus.java.ooprogaram.practise;

public class Student {

    private String name;
    private int age;
    private int gender;
    private String phone;
    private String address;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Student()
    {
        System.out.println("student 默认的构造器~~~");
    }

    public Student( String name,
             int age, int gender, String phone, String address, String email)
    {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }

}
