package Demo08.Demo03;


public class Myclass {
    int num;
    static  int numstatic;//静态变量
    public  void Method(){
        System.out.println("这是一个普通的成员方法");
        System.out.println(num);//成员变量可以访问成员方法
        System.out.println(numstatic);//静态变量可以访问成员方法
    }
    public  static  void methodStatic(){
        System.out.println("这是一个静态方法");
        System.out.println(numstatic);//静态变量可以访问静态方法
//        System.out.println(num);//静态变量不能访问静态方法
//        静态方法不能使用静态关键字
//        System.out.println(this);
    }

}
