package Demo07;
/*
题目：猜数字小游戏

思路：
1.首先随机参数一个随机数字，并且一旦产生就不会发生变化，使用Random的nextInt()参数随机数
2.需要键盘输入，所以用到了Scanner
3.获取键盘输入的数据，使用Scanner中的nextInt()方法
4.已经得到了两个数字，需要if判断一下
    4.1.如果太大了，提示太大，并且重试
    4.2.如果太小，提示太小，并且重试
    4.3如果猜中，游戏结束
5.重试就是再来一次，循环，次数不确定，用while(true)
*/

import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r=new Random();
        //产生的随机数
        int RandomNum=r.nextInt(100)+1;//1-100

        //获取键盘输入的猜测数

        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("输入你猜的数字");
            int guessNum = sc.nextInt();


            if (guessNum > RandomNum) {
                System.out.println("猜大了，请重试");
            } else if (guessNum < RandomNum) {
                System.out.println("猜小了，请重试");
            } else{
                System.out.println("恭喜你，猜对了");break;
            }
        }

    }


}
