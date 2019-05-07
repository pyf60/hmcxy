package Demo03;
/*
* 问题描述：定义年龄，无法阻止不合法数值
* 解决办法：通过使用private关键字将需要保护的成员变量进行修饰
* 一旦使用private进行修饰，本类当中仍然可以随意修饰
* 但是超出本类范围就会出现错误哦
*
* 但是可以间接访问
* get与set方法
* set有参数无返回
* get无参数有返回
* */
public class Person {

  private   String name;
   private int age;
    public void  show(){
        System.out.println("我叫"+name+"今年"+age+"岁");
    }
    //这个成员方法，专门用于向age设置数据
    public  void setAge(int num){
        if (num<100&&num>=0){
            age=num;
        }else {
            System.out.println("非法格式");
        }

    }
    //这个成员方法，专门用于向age获取数据
    public int getAge(){
        return age;
    }


    public  void setName(String name1){
        name=name1;
    }
    public  String getName(){
        return name;
    }
}
