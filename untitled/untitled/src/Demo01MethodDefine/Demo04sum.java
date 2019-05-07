package Demo01MethodDefine;
/*求出1-100之间所以和之数*/
public class Demo04sum {
    public static void main(String[] args) {
        System.out.println("结果是："+getsum());
    }


    /*
    * 三要素：有返回值，计算结果是一个
    * 返回值：getsum
    * 方法名称：范围已经确定，不需要任何条件
    * */
    public  static int getsum(){
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            sum+=i;

        }
        return  sum;
    }
}
