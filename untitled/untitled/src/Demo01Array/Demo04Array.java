package Demo01Array;

public class Demo04Array {
    public static void main(String[] args) {
        int[] Array={10,20,30};
//        直接打印数组名称，打印内存的哈希地址
        System.out.println(Array);//[I@1b6d3586
//        访问数组元素格式
//                数组名称[索引值]
//                        索引值从0开始，到数组长度减一为止
        System.out.println(Array[0]);//10
        System.out.println(Array[1]);//20
        System.out.println(Array[2]);//30
        System.out.println("=================");
        System.out.println("=               =");
        System.out.println("=               =");
        System.out.println("=               =");
        System.out.println("=================");
        int number=Array[1];
        System.out.println(number);

    }
}
