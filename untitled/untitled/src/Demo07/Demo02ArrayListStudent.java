package Demo07;

import java.util.ArrayList;

/*
题目：自定义四个学生对象，添加到集合，并遍历

思路：
* 定义学生类，四个部分
创建一个集合，用来存储学生对象，泛型<Student>
根据类，创建四个学生对象
将四个学生对象添加到集合add
遍历集合for，size，get

* */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();

        Student one=new Student("洪七公",23);
        Student two=new Student("欧阳锋",42);
        Student three=new Student("黄药师",43);
        Student four=new Student("段子星",65);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println("姓名："+stu.getName()+"年龄："+stu.getAge());
        }

    }
}
