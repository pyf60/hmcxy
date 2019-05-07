package Demo02MethodOverload;
//在多重输出语句，println就是一个重载
public class Demo04OverloadPrint {

    public static void main(String[] args) {
        myPrint(100);
        myPrint(100.0);
        myPrint("ss");
    }

    public static void myPrint(byte num){
        System.out.println(num);
    }
    public static void myPrint(short num){
        System.out.println(num);
    }

    public static void myPrint(int num){
        System.out.println(num);
    }
    public static void myPrint(long num){
        System.out.println(num);
    }
    public static void myPrint(float num){
        System.out.println(num);
    }
    public static void myPrint(double num){
        System.out.println(num);
    }
    public static void myPrint(boolean ll){
        System.out.println(ll);
    }
    public static void myPrint(String num){
        System.out.println(num);
    }
}
