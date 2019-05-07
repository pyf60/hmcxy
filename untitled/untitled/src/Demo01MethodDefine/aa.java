package Demo01MethodDefine;
//方法的三种调用方式
//1.单独调用：方法名称（参数）；
//2.打印调用：System.out.println(方法名称（参数）);
//3.赋值调用 数据类型 变量名称=方法名称（参数）;

//类型为void的方法，不能使用打印调用和赋值调用
public class aa {
   public  static  int sum(int a,int b){
      int result=a+b;
       return  result;
   }

    public static void main(String[] args) {
        sum(10,20);
        System.out.println("==========");
//打印调用
        System.out.println(sum(10,30));

        //赋值调用

                /*1.找到方法
                2.参数调用
                3.执行方法体
                4.返回值返回到调用处*/
        int number=sum(10,60);
        System.out.println("变量的值\n"+number);
    }
}
