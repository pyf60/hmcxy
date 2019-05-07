package Demo02MethodOverload;
//适用与功能类似，但是参数不同的方法
//方法的重载，方法名称相同，参数列表不同

//方法重载与下列因素相关
    //1.参数个数不同
    //2.参数类型不同
//    3.方法的多类型参数不同


//方法重载与下列因素无关
/*1.与参数名称无关
2.与方法返回值类型无关
3.*/



public class Demo01Overload {

    public static void main(String[] args) {
        System.out.println(sumThree(10));
        System.out.println(sumThree(10,20));
        System.out.println(sumThree(10,20,30));
    }
    //单个参数
    public static int sumThree(int a){
        return  a;
    }
    //两个参数
    public static int sumThree(int a,int b){
        return  a+b;
    }
    public static double sumThree(double a,int b){
        return  a+b;
    }
    public static int sumThree(int a,double b){
        return  (int)(a+b);
    }
    //三个参数
    public static int sumThree(int a,int b,int c){
        return  a+b+c;
    }

    /*与方法返回值类型无关
    public static int sumThree(int a,int b,int c){
        return  a+b+c+0.0;

        }
        */
    }


