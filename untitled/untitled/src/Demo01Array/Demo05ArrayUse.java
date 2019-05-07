package Demo01Array;
//使用动态初始化，其中的元素会自动拥有一个默认值，规则如下
//类型        默认值
//int             0
//double         0.0
//字符类型       \u0000
//boolean       flase
//引用类型        null


//注意事项
//1.静态初始化也有默认值，只不过系统直接赋值了大括号内内容



public class Demo05ArrayUse {
    //动态初始化
    public static void main(String[] args) {
        int[] Array=new int[5];
        System.out.println(Array);
        System.out.println(Array[1]);
        System.out.println(Array[2]);
        System.out.println(Array[3]);
        //赋值
        System.out.println("=========");
        Array[1]=123;
        System.out.println(Array[1]);
        System.out.println(Array[2]);
        System.out.println(Array[3]);
    }


}
