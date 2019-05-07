package Demo03;
/*
成员变量在方法外部，整个类全部可以通用
局部变量在方法内部，只能在方法内使用

局部变量没有默认值，必须手动进行赋值
成员变量有默认值，和数组一样

内存位置不同
被static修饰的成员变量和成员方法独立于该类的任何对象。也就是说，它不依赖类特定的实例，
被类的所有实例共享。只要这个类被加载，Java虚拟机就能根据类名在运行时数据区或者方法区内找到他们。
因此，static对象可以在它的任何对象创建之前访问，无需引用任何对象。
*/

public class Demo01VariableDifference {
//    成员变量
   static String name;


    public static void  method(){
        int num=20;//局部变量
       System.out.println(name);
        System.out.println(num);

    }
    public static void  method1(int param){
    System.out.println(param);
    }

    public static void main(String[] args) {
       method();
       method1(2);
    }
}
