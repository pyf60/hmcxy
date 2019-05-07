package Demo01MethodDefine;
/*注意事项*/
//1.方法应该定义在类中，不能在方法中，不能嵌套
//2.方法无顺序
//3.方法定义之后不会执行，需要调用，无参只能单独调用，有参可以三种调用
//4.如果方法有返回值，必须加上return
//5.返回值类型必须一致
//6.对于一个void没有返回值的方法，不能写return后面的返回值，只写return；
//7.对于方法最后一行的return，可以省略不写
//8.可以有多个return语句，但必须保证只能同时只有一个执行,两个return不能连写；
public class Demo06Notice {
    public static void main(String[] args) {
        System.out.println( sum(10,20));

    }
    //返回值类型必须一致
    public static int method1(){
        return 10;
    }

    public  static  void  method2(){
        return;
    }
    public  static int sum(int a,int b){
        if(a>b){
            return  a;
        }else {
            return b;
        }
    }

}
