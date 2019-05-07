package Demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu=new Student();
stu.setAge(21);
stu.setName("dfasd");
        System.out.println(stu.getAge()+stu.getName());

        stu.setAge(34);
        stu.setName("赵丽颖");
        System.out.println(stu.getAge()+stu.getName());
    }


}
