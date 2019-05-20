package com.genpus.java.ooprogaram.practise;

public class ContactList {

    public static String findByName(String name, Student[] students) {
        boolean flag = false;
        for (Student stu : students) {
            String stuName = stu.getName();
            System.out.println(stuName);
            if (name.equals(stuName)) {
                flag = true;
                System.out.println("查找到名为： " + name + "的用户");
                break;
            }
        }
        if (!flag) {
            System.out.println("未查找到名为： " + name + "的用户");
        }
        return null;
    }

    public static Boolean findByEmail(String email, Student[] students) {
        boolean flag = false;
        for (Student stu : students) {
            String stuEmail = stu.getEmail();
            if (email.equals(stuEmail)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static String findByAddress(String address, Student[] students) {
        return null;
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++) {
            Student stu = new Student();
            stu.setAge(i + 10);
            stu.setAddress("beijing NO." + i + "Street");
            stu.setName("xiaMin " + i);
            stu.setEmail("china" + i + "@126.com");
            stu.setGender(i % 2 == 0 ? 1 : 0);
            stu.setPhone("1330951199" + i);
            students[i] = stu;
        }
        findByName("xiaMin 2", students);
        if (findByEmail("china2@126.com", students)) {
            System.out.println("查找到邮箱 ");
        } else {
            System.out.println("未找到邮箱！");
        }

        Student student = new Student("xiaoMing", 28, 1, "18909599999", "china BeiJing", "longy@189.com");
        Student student2 = new Student("xiaoHuang", 29, 0, "18909599998", "china NanJing", "longy22@189.com");
        Student student3 = new Student("xiaoYu", 27, 1, "18909599966", "china TianJing", "longydd@189.com");

        Student[] stud = new Student[3];
        stud[1] = student;
        stud[0] = student2;
        stud[2] = student3;

        findByName("xiaoHuang2", stud);

    }
}
