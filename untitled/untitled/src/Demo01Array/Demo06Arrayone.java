package Demo01Array;

public class Demo06Arrayone {
    public static void main(String[] args) {
        int[] Array=new int[3];
        System.out.println(Array);
        System.out.println(Array[0]);
        System.out.println(Array[1]);
        System.out.println(Array[2]);
        Array[1]=10;
        Array[2]=20;
        System.out.println("==========");
        System.out.println(Array);
        System.out.println(Array[0]);
        System.out.println(Array[1]);
        System.out.println(Array[2]);
    }
}
