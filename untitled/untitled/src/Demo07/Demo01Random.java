package Demo07;

import java.util.Arrays;
import java.util.Random;

/*
参数随机数
Random类用来生成随机数
三个步骤
1.导包
import java.util.Random;
2.创建
        Random r=new Random();
3.使用
获取一个随机数字
获取一个随机的int数字（范围是int所有范围），
int a=r.nextInt();
获取一个有范围的随机数字,参数代表了范围，左闭右开区间
int b=r.nextInt(3);
实际上代表的含义是[0,3),也就是0到2，3取不到


* */
public class Demo01Random {
    public static void main(String[] args) {
//        2.创建
        Random r=new Random();
//        3.使用
        int a=r.nextInt(3);//只能取0,1,2
        int[] array=new int[100];
        System.out.println("随机数字是："+a);
        for (int i = 0; i < 100; i++) {

             array[i]= r.nextInt(100);

    }
        System.out.println(Arrays.toString(array));
    }
}
