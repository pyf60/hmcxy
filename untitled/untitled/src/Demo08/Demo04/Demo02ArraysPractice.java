package Demo08.Demo04;

import java.util.Arrays;

/*
* 请使用Arrays相关的api，将一个随机字符串中的所有字符按照升序进行排列，并且倒序打印
*
*
* */
public class Demo02ArraysPractice {
    public static void main(String[] args) {
        String str="qwertyuiopasdfghjklzxcvbnm";
//        如何进行升序排列，sort
//    必须是一个数组，才能使用Arrays.sort方法
//    String——》数组，用tocharArray

        char[] chars = str.toCharArray();
        Arrays.sort(chars);//对字符数组进行升序排列
                for (int i=chars.length-1;i>=0;i--) {

                    System.out.print(chars[i]);
                }


    }

}
