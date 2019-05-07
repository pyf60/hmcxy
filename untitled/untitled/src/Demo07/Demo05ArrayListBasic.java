package Demo07;

import java.util.ArrayList;
/*
* 如果希望向ArrayList集合添加基本类型，需要使用基本类型的包装类
* 基本类型 包装类（基本类型，包装类都为与java.lang包下
* byte      Byte
* int       Integer
* long      Long
* short     Short
* double    Double
* float      Float
* char      Character
* boolean   Boolean
*
*
* */
public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        //不能是基本类型
//        ArrayList<int> list1=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();

        list.add("赵丽颖");
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");

        list1.add(100);
        list1.add(200);
        System.out.println(list1);
        int one=list1.get(0);
        System.out.println(one);
    }
}
