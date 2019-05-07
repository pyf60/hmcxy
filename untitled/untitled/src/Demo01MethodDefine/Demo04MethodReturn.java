package Demo01MethodDefine;

//定义一个方法，求出两数之和
public class Demo04MethodReturn {


    public  static  int getsum(int a,int b){
        int result=a+b;
        return  result;

    }
    //没有返回值，直接打印输出,只能使用单独调用
    public  static void  pointSum(int a,int b){
        int result=a+b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        int num=getsum(10,52);
        System.out.println("return:"+num);
        pointSum(10,20);
    }
}
