package Demo06;

import java.util.Scanner;//1.导包

/*

Scanner类可以实现键盘输入数据，到程序中去
y引用类型的一般使用步骤
1，导包

import 包路径.类名称
如果当前使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写
只要java.lang包下的内容不需要导包，其他的包都需要import导包
2，创建
类名称 对象名=new 类名称（）;

3，使用
对象名.成员方法名（）;


从键盘获取一个int数字：  int num= sc.nextInt();
从键盘获取一个字符串：String str=sc.next();
注意：其实从键盘输入的都是字符串，next是原封不动输出，nextInt是将输入的字符串转换为数字，int为返回值
* */
public class Demo01Scanner {
    public static void main(String[] args) {

        String str=" ";//lang包下
//2.创建
       Scanner sc=new Scanner(System.in);//System.in代表从键盘输入
      int num= sc.nextInt();
        System.out.println("输入的int数字是"+num);
        String str1=sc.next();
        System.out.println("输入的字符串是"+str1);
    }
}
