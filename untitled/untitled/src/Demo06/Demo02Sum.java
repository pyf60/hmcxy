package Demo06;


import java.util.Scanner;

/*键盘输入两个数字，求出和
* 1.键盘输入Scanner
* 2.Scanner三个步骤：导包，创建，使用
* 3.需要两个数字，调用两次nextInt方法
* 4.得到两个数字，加在一起
* 5.打印输出
*
* */
public class Demo02Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a=sc.nextInt();
        System.out.println("请输入第二个数字");
        int b=sc.nextInt();

        int result=a+b;
        System.out.println("结果是："+result);
    }
}
