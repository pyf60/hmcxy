package Demo08.Demo04;

import java.util.Arrays;

/*
* java.util.Arrays是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数组常见操作
*
* public static String toString(数组)，将参数数组装换为字符串，按照默认格式[元素1，元素2]
*
* public static void sort(数组）按照升序进行排列
*
* 备注：
* 1.如果是数字，从小到大排序
* 2.如果是字符串，sort按照字母升序排列
* 3.如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持
*
* */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArrays={1,2,3,4,5};
        String instr= Arrays.toString(intArrays);
        System.out.println(instr);

        int[] array1={1,4,5,2,6,2};
        Arrays.sort(array1);
        System.out.println( Arrays.toString(array1));

        String[] array2={"aaa","bbb","ccc"};
        Arrays.sort(array2);

        System.out.println(Arrays.toString(array2));
    }
}
