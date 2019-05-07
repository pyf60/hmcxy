package Demo06;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //普通使用方式
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();

//    匿名对象方式
//        int sum= new Scanner(System.in).nextInt();
//        System.out.println(sum);

//        使用一般方法传入参数
//        Scanner sc=new Scanner(System.in);
//        method(sc);


//        使用匿名对象来进行传参
     // method(new Scanner(System.in));

//        使用匿名对象求返回值
        Scanner scanner = methodReturn();
        int num= scanner.nextInt();
        System.out.println(num);

    }

public  static  void  method(Scanner sc){
    int num = sc.nextInt();
    System.out.println(num);
}

    public  static Scanner methodReturn(){
        //一般格式
//        Scanner sc=new Scanner(System.in);
//        return sc;
        return  new Scanner(System.in);
    }



}
