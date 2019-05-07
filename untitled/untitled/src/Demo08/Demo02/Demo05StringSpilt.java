package Demo08.Demo02;
/*
分割字符串的方法：
public String[] split(String regex)：按照参数的规则，将字符串切分成为若干部分。

注意事项：
split方法的参数其实是一个“正则表达式”，今后学习。
今天要注意：如果按照英文句点“.”进行切分，必须写"\\."（两个反斜杠）
 */
public class Demo05StringSpilt {
    public static void main(String[] args) {
        String str="aaa,bbb,ccc";
        String[] array1 = str.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("===========");

        String str2="aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("===========");
/*        split方法的参数其实是一个“正则表达式”，今后学习。
        今天要注意：如果按照英文句点“.”进行切分，必须写"\\."（两个反斜杠）*/
        String str3="AAA.BBB.CCC";
        String[] split = str3.split(".");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        String str4="AAA.BBB.CCC";
        String[] split1 = str4.split("\\.");
        for (int i = 0; i < split1.length; i++) {
            System.out.println(split1[i]);
        }
    }
}
