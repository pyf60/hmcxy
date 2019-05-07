package Demo08.Demo02;
/*
* ==是对象地址值进行比较，如果确实需要字符串内容的比较，可以使用两个方法
* public boolean equals(Object obj)参数Object类型可以是任何对象，
* 只有参数是一个字符串并且内容相同才会给一个ture
*
* 注意事项：
* 任何对象都可以用Object进行接收
*equals方法中a.equals(b)和b.equals(a)效果一样
* 如果比较一个常量和一个变量，推荐把字符串写在前面，字符串使用双引号
*
* public boolean equals(str)//忽略大小写进行字符串的比较
* */
public class Demo01StringEquals {

    public static void main(String[] args) {
         String str1="hello";
         String str2="hello";
        char[] charArray={'h','e','l','l','o'};
        String str3=new String(charArray);

        System.out.println(str1.equals(str2));//true
        System.out.println(str2.equals(str3));//true
        System.out.println(str3.equals("hello"));//true
        System.out.println("hello".equals(str1));//ture


        String str="Hello";
        System.out.println(str.equals(str1));

        String str5=null;
        System.out.println("abc".equals(str5));//flase
      ///  System.out.println(str5.equals("abc"));//报错，是空指针(NullPointerException)，所以推荐字符串在前


        System.out.println("============");


        String strA="java";
        String strB="JAVA";
        System.out.println(strA.equals(strB));//flase
//        需注意只区分英文字母大小写8
        System.out.println(strA.equalsIgnoreCase(strB));//忽略大小写比较,true


    }



}
