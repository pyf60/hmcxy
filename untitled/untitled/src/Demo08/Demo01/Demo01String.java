package Demo08.Demo01;

/*java.lang.String
String 类代表字符串。Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。
其实就是说，程序当中的所有的双引号字符串，都是String类型，（就算没有new，都是String字符串）

字符串的特点：
1、字符串的内容不可改变
2、正是因为字符串不可改变，所以字符串可以共享使用
3、字符串效果上相当于char[]型字符数组，底层原理是byte[]型字节数组


创建字符串的常见3+1种方式
三种构造方法
public String(),创建一个空白字符串，不含有任何内容
public String（char[] array） 根据字符数组的内容，来创建指定的字符串
public String（byte[] array）根据字节数组的内容，来创建指定的字符串
1、一种直接创建
String Str="abc";
注意：直接写上双引号，就是一个字符串对象
*/

public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造
        String Str1=new String();
        System.out.println("第一个字符串是什么"+Str1);

        //根据字符数组创建字符串
        char[] charArray={'a','b','c'};
        String Str2=new String(charArray);
        System.out.println("第二个字符串数组是"+Str2);

        //根据字节数组创建字符串
        byte[] byteArray={97,98,99};
        String Str3=new String(byteArray);
        System.out.println("第三个字符串是"+Str3);//直接将ascll转换为对应字符输出，abc

        //直接创建
    String Str4="abc";
        System.out.println("第四个字符串"+Str4);

    }



}
