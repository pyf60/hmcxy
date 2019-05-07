package Demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person=new Person();
        person.show();
        person.setName("zhaoliying");
//        person.age=-19;//直接访问private修饰变量是错误的，需要使用get与set方法
        person.setAge(-20);//数据不合理输出为0

        person.show();
    }


}
