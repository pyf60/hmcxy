package object;
/*
* 成员变量是直接定义在方法外，在类中
* 成员方法不要写static关键字*/
public class Student {
    //成员变量
    String name;
    int age;

    //成员方法
    public  void eat(){
        System.out.println("eat");
    }
    public  void sleep(){
        System.out.println("sleep");
    }
    public void study(){
        System.out.println("study");
    }
}
