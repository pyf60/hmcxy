package Demo07;

import java.util.ArrayList;
import java.util.Random;

/*用一个大集合存入20个随机数，然后筛选偶数元素，放到小集合
*
*分析
* 1.需要创建一个大集合，用来存放int数<Integer>
*2.随机数参数需要Random nextInt
* 3.循环20次，把数字装入大集合，for循环，add方法
* 4.定义一个方法，用来筛选
*   4.1筛选根据大集合，筛选符合要求的元素，得到小集合
* 三要素
*   4.2返回值类型ArrayList小集合（里面元素个数不确定）
*   4.3方法名称getsmallList
* 4.4参数列表ArrayList大集合（装有20个随机数）
* 5.判断if是偶数sun%2==0；
* 6.如果是偶数，放到小集合，如果不是不放
*
* */
public class Demo03ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> Biglist = new ArrayList<>();
        Random r = new Random();
        //参数20个随机数
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;

            Biglist.add(num);
        }
        System.out.println("获取20个数是");
        System.out.println(Biglist);



        ArrayList<Integer> smallList = SmallList(Biglist);
        System.out.println("获取数据个数："+smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.print(smallList.get(i)+",");
        }
    }
    //这个集合接收大集合参数，返回小集合参数
    public  static ArrayList<Integer> SmallList(ArrayList<Integer> bigList){
        //创建一个小集合，用来装偶数结果
        ArrayList<Integer> smalllist=new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num=bigList.get(i);
            if(num%2==0) {
                smalllist.add(num);
            }
        }
      return  smalllist;
        }

    }

