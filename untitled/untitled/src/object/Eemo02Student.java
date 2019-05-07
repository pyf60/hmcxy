package object;
/*通常情况下，一个方法并不能直接使用，需要根据类创建一个对象，才能使用

1.导包：指出需要使用的类在什么位置
import 包名称.类名称
import cn.itcast.day06.Student
对于和当前类属于一个包的情况下，可以省略导包不写
2.创建
格式
类名称.对象名=new 类名称（）；
student stu=new student();

3.使用
使用成员变量 对象名.成员变量名
使用成员方法 对象名.成员方法名（参数）;
(也就是，想用谁，就用对象名点谁)


*/
public class Eemo02Student {
    public static void main(String[] args) {
        //导包，因为处于同一个文件夹下，所以省略

//        2.创建
//                格式
//        类名称.对象名=new 类名称（）；
//        根据student创建一个名为stu的对象

        Student stu=new Student();
//        3.使用其中的成员变量
//        格式
//        对象名.成员变量名
//        成员变量未赋值，将会输出默认值，和数组一样
//          是默认值输出null和0
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.name="zhaoliying ";
        stu.age=12;
        System.out.println("=============");
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("===============");

//        使用对象的成员方法
//        对象名.成员方法名（参数）;


        stu.eat();
        stu.sleep();
        stu.study();



    }
}
