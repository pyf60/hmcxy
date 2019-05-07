package Demo07;
//根据int变量n的值，来获取随机数字，范围是[1,n],两边都可以取到

import java.util.Arrays;
import java.util.Random;

/*        思路：
        定义一个变量n，随意赋值
        需要使用random三个步骤：导包，创建，使用
        如果写10，常规是0-9，现在需要10，可以发现，整体加一即可
        打印随机数字*/
public class Demo03Random {

    public static void main(String[] args) {
        int n=5;
        Random r=new Random();
        int[] array=new int[10];
        for (int i = 0; i < 10; i++) {
        array[i] = r.nextInt(n) +1;//本来范围是[0,n),整体+1，范围是[1,n];

        }
        System.out.println(Arrays.toString(array));

    }
}
