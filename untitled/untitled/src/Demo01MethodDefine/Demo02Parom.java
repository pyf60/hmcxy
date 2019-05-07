package Demo01MethodDefine;

public class Demo02Parom {

    /*有参数：小括号里面有内容
    * 无参数：小括号没内容，一个方法不需要任何参数条件，自己就能独立完成方法*/

    public static void main(String[] args) {
        Method01(10,2);
        method02();
    }
    //两个数字相乘
    //有参
    public  static  void  Method01(int a,int b){
        int result =a*b;
        System.out.println("结果是"+result);

    }
    //一个方法不需要任何参数条件，自己就能独立完成方法
    public  static  void method02(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hello world"+i);
        }
    }
}
