package Demo01Array;

public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int[] Array={10,20,30};

        System.out.println(Array[0]);
        System.out.println(Array[1]);
        System.out.println(Array[2]);
//        错误写法，并不存在3号元素
//        数组越界异常
//                ArrayIndexOutOfBoundsException
//        System.out.println(Array[3]);
    }

}
