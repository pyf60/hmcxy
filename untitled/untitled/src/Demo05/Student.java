package Demo05;
/*
* y一个标准的类通常满足下列四个组成部分
*
* 所以的成员变量都要使用private关键字
* 为每一个成员变量编写getter与setter方法
* 编写一个无参数构造方法
* 编写一个全参数的构造方法
* */
public class Student {
    private  String name;
    private int age;

    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//无参数的构造方法
    public Student() {
    }

//全参数的构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
