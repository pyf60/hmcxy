package Demo01Array;
/*
* 动态初始化（指定长度），创建数组直接给出长度
* 静态初始化（指定内容），在创建数组的时候，不直接指定数据个数的多少，而是直接选择具体的数据内容进行指定
*
* 静态初始化基本格式
* 数组类型[] 数组名称=new 数据类型[]{元素1，元素2，元素3，元素4}；
*
* 虽然静态初始化没有直接告诉长度，但是根据大括号里面的元素具体内容，也可以具体推测出来长度
* */
public class Demo02Array {


    public static void main(String[] args) {
        //直接创建一个数组，里面装int类型，具体内容为5，15，25
        int[] ArrayA=new int[]{5,15,25,3};
        String[] ArrayB=new String[]{"hello world","java"};
        System.out.println(ArrayA.length);//4
        System.out.println(ArrayB.length);//2
    }
}
