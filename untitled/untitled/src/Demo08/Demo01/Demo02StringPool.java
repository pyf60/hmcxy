package Demo08.Demo01;
/*
* 字符串常量值，程序当中直接用双引号写上的字符串，就在字符串常量池中
* 对于基本常量来说，==就是进行【数值】的比较；
* 对于引用常量来说，==是进行【地址值】的比较；
*
* */
public class Demo02StringPool {
    public static void main(String[] args) {
        String Str1="abc";
        String Str2="abc";
        char[] charArray={'a','b','c'};
        String Str3=new String(charArray);
        System.out.println(Str1==Str2);
        System.out.println(Str2==Str3);
        System.out.println(Str1==Str3);

    }
}
