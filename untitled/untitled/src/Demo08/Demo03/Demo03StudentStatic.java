package Demo08.Demo03;

public class Demo03StudentStatic {

    public static void main(String[] args) {
//        首先设置一个教室，这是静态的东西，所以通过类名来进行调用
        Student.room="101教室";

        Student one=new Student("郭宁",17);
        System.out.println("one的名字"+one.getName());
        System.out.println("one的年龄"+one.getAge());
        System.out.println("one的教室"+Student.room);


        Student two=new Student("黄蓉",32);
        System.out.println("two的名字"+two.getName());
        System.out.println("two的年龄"+two.getAge());
        System.out.println("two的教室"+Student.room);



    }
}
