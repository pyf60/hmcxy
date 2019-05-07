package Demo04;
//构造方法其实就是专门用来创建对象的方法，当我们通过new创建关键字，其实就是在调用构造方法
/*

格式
public 类名称（参数类型 参数名称）{
    方法体
        }

1.构造方法必须和所在类名称一模一样，大小写也一样
2.无返回值类型，连void都没有
3.构造方法不能使用return作为返回值
4.如果没有编写任何构造方法，编译器默认赠送一个构造方法，没有参数，方法体什么都不做
public Student(){}
5.一旦编写了至少一个构造方法，编译器将不再赠送
6.构造方法也是可以重载
重载：方法名称相同，参数列表不同
*/

public class Student {
private  String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
//    无参构造方法执行了
    public  Student(){
    System.out.println("无参构造方法执行了");
}
//    有参构造方法执行了
    public  Student(String name,int age){
        System.out.println("有参构造方法执行了");
        //将局部变量转换成成员变量
        this.age=age;
        this.name=name;

    }

}
