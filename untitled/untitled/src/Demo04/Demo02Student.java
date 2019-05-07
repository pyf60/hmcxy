package Demo04;

public class Demo02Student {
    public static void main(String[] args) {

        Student stu=new Student();//new对象就是在调用构造方法
        System.out.println("=============");
        Student stu2=new Student("zhaoliying",23);
        System.out.println("名字："+stu2.getName()+"年龄"+stu2.getAge());
    //如果需要修改名字或者年龄，使用setter方法
        stu2.setAge(25);
        System.out.println("名字："+stu2.getName()+"年龄"+stu2.getAge());
    }


}
