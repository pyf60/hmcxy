package Demo01Array;

public class Demo07ArrayLength {
    public static void main(String[] args) {
        int[] ArrayA=new int[3];
        int[] ArrayB={10,20,30,2,5,3,5,12,5,3,5,2};
        System.out.println(ArrayA.length);
        System.out.println("==========");
        System.out.println(ArrayB.length);

        System.out.println("=========");
        //程序运行期间，长度不可改变
        //两个数组只是名字相同，但是值不同，存放在不同内存空间
        int[] ArrayC=new int[3];
        System.out.println(ArrayC.length);
        ArrayC=new  int[5];
        System.out.println(ArrayC.length);

    }
}
