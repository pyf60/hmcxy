package Demo08.Demo02;
/*String当中与获取相关的常用方法有：

public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串。
public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始。）
public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。*/
public class Demo02StringGet {

    public static void main(String[] args) {
//        public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
        int length = "hkjsdhfksdhfksdhfls".length();
        System.out.println(length);

        //拼接字符串
        String str="hello";
        String str2="world";
        String str3=str.concat(str2);
//        字符串不可改变，只会新创建
        System.out.println(str);//hello原封不动
        System.out.println(str2);//world原封不动
        System.out.println(str3);//helloworld,是新产生的字符串
//      获取指定位置的单个字符
        char e = "hello".charAt(1);
        System.out.println(e);
//        查找参数字符串在本来字符串第一次出现的索引未知
//        如果根本没有返回值-1
        String original="helloworld";
        int index = original.indexOf("llo");
        System.out.println("第一次出现索引"+index);//2
        System.out.println(original.indexOf("kjh"));//没有-1

    }
}
