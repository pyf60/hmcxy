package Demo08.Demo03;
/*如果一个成员变量使用static关键字，那么变量不再属于对象自己，而是属于对象所在的类，多个对象共享一份数据*/
public class Demo01StaticField {
    public static void main(String[] args) {

        Student one = new Student("郭靖", 19);
        one.room = "101教室";
        System.out.println("姓名：" + one.getName()
                + "，年龄：" + one.getAge() + "，教室：" + one.room
                + "，学号：" + one.getId());

        Student two = new Student("黄蓉", 16);

        System.out.println("姓名：" + two.getName()
                + "，年龄：" + two.getAge() + "，教室：" + two.room//two与one内容相同，多个对象共享同一份内容
                + "，学号：" + two.getId());


    }
    }

