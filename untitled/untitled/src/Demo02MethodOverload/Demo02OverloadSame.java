package Demo02MethodOverload;
/*
* 比较两个数是否相等
* 参数类型分别是short，interesting，long，byte；
* */
public class Demo02OverloadSame {

    public static void main(String[] args) {
        byte a=10;
        byte b=20;
        System.out.println(IsSame(a,b));
        System.out.println(IsSame((short)10,(short)10));
        System.out.println(IsSame(10,10));
        System.out.println(IsSame(10L,10L));

    }

    public static boolean IsSame(byte a,byte b){
        System.out.println("两个byte参数执行结果");
        boolean same;
        if (a==b){
            same=true;
        }else {
            same=false;
        }
        return  same;
    }

    public static boolean IsSame(short a,short b){
        System.out.println("两个short参数执行结果");
        boolean same=a==b?true:false;
        return same;
    }
    public static boolean IsSame(int a,int b){
        System.out.println("两个int参数执行结果");
        return a==b;
    }
    public static boolean IsSame(long a,long b){
        System.out.println("两个long参数执行结果");
        if(a==b){
            return true;
        }else {
            return false;
        }
    }


}
