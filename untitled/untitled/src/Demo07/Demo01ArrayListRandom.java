package Demo07;

import java.util.ArrayList;
import java.util.Random;

/*
* 生成6个1—33的随机整数，添加到集合，并遍历集合
*
*
*思路：
* 1.循环存储6个数字，创建一个集合（Integer）
* 2.产生随机数，需要用到random
* 用循环6次，来参数6个数字，for循环
* 循环内调用r.nextInt(int x)方法，参数33，范围0-32，整体加1
* 把数字添加到集合add
* 遍历集合，for，size，get
*
* */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 6; i++) {
            int num=r.nextInt(33)+1;
            list.add(num);
        }
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }





}
