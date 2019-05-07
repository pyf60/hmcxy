package object;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one=new Phone();
        one.price=8933;
        one.color="blue";
        one.brand="apple";
        method(one);//传递进去的就是地址值

    }
    public static void method(Phone param){
//        Phone类方法，具有Phone所以属性
        System.out.println(param.price);
        System.out.println(param.color);
        System.out.println(param.brand);


    }
}
