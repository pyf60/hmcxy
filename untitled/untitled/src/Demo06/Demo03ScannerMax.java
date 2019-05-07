package Demo06;

import java.util.Scanner;

/*键盘输入三个数字，求出最大值
*
* 1.需要用到输入，需要Scanner
* 2.Scanner三个步骤：导包，创建，使用
* 3.需要两个数字，调用三次nextInt方法，得到三个int变量
* 4.无法同时判断三个数最大，应该抓换为两个步骤
*   4.1.前两个当中谁最大，拿到前两个最大值
*   4.2.拿着前两个当中最大值，然后与第三个数比较，得到最大值
* 5.打印
* */
public class Demo03ScannerMax {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a=sc.nextInt();
        System.out.println("请输入第二个数字");
        int b=sc.nextInt();
        System.out.println("请输入第三个数字");
        int c=sc.nextInt();


        //得到前两个最大值
        int temp=a>b?a:b;
        int max=temp>c?temp:c;
        System.out.println("最大值"+max);
    }


}
