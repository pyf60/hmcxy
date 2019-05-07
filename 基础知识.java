private 关键字
{
    使用方法：直接放在成员变量最前方

    1. 不能直接访问，但是可以间接访问修改
    2、修改使用需要通过set与get方法
    3.set与get方法可以添加条件语句
    4.{
        * set有参数无返回
        * get无参数有返回
     }
5.使用方法
//set
     public  void setName(String name1){
        name=name1;
    }
//get
    public  String getName(){
        return name;
    }
}


this 关键字
{
    格式
    this.成员变量名
    解决重名分不开情况
    通过谁调用方法，谁就是this
      person.sayhello("王思聪");
      所以是Person中name

      在set与getter方法中
      this.name=name; 代表将 成员变量 赋值 局部变量（参数），二者使用同一个参数名

}



构造方法
{

    构造方法其实就是专门用来创建对象的方法，当我们通过new创建关键字，其实就是在调用构造方法


    格式
    public 类名称（参数类型 参数名称）{
        方法体
            }

    1.构造方法必须和所在类名称一模一样，大小写也一样
    2.无返回值类型，连void都没有
    3.构造方法不能使用return作为返回值
    4.如果没有编写任何构造方法，编译器默认赠送一个构造方法，没有参数，方法体什么都不做
    public Student(){}
    5.一旦编写了至少一个构造方法，编译器将不再赠送
    6.构造方法也是可以重载
    重载：方法名称相同，参数列表不同






}


API
{
    Scanner进行键盘输入
    Scanner sc=new Scanner();


    
        Scanner类可以实现键盘输入数据，到程序中去
        引用类型的一般使用步骤
        1，导包

        import 包路径.类名称
        如果当前使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写
        只要java.lang包下的内容不需要导包，其他的包都需要import导包
        2，创建
        类名称 对象名=new 类名称（）;

        3，使用
        对象名.成员方法名（）;


        从键盘获取一个int数字：  int num= sc.nextInt();
        从键盘获取一个字符串：String str=sc.next();
        注意：其实从键盘输入的都是字符串，next是原封不动输出，nextInt是将输入的字符串转换为数字，int为返回值

}

求出三个数最大值
{

    键盘输入三个数字，求出最大值
    *
    * 1.需要用到输入，需要Scanner
    * 2.Scanner三个步骤：导包，创建，使用
    * 3.需要两个数字，调用三次nextInt方法，得到三个int变量
    * 4.无法同时判断三个数最大，应该抓换为两个步骤
    *   4.1.前两个当中谁最大，拿到前两个最大值
    *   4.2.拿着前两个当中最大值，然后与第三个数比较，得到最大值
    * 5.打印

}


匿名对象
{
        创建对象标准格式
        * 类名称 对象名=new 类名称（）;
        *
        *
        * 匿名对象就是只有右边的对象，没有左边的名字
        * 格式
        * new 类名称（）;
        * 匿名对象只能使用唯一一次，下次再用不得不再创建一个新对象
        * 使用建议：如果确定一个对象只需要使用一次，就可以使用匿名对象


匿名对象的使用具体实例
        {
            
import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
                //普通使用方式
        //        Scanner sc=new Scanner(System.in);
        //        int num=sc.nextInt();

        //    匿名对象方式
        //        int sum= new Scanner(System.in).nextInt();
        //        System.out.println(sum);

        //        使用一般方法传入参数
        //        Scanner sc=new Scanner(System.in);
        //        method(sc);


        //        使用匿名对象来进行传参
            // method(new Scanner(System.in));

        //        使用匿名对象求返回值
                Scanner scanner = methodReturn();
                int num= scanner.nextInt();
                System.out.println(num);

            }

        public  static  void  method(Scanner sc){
            int num = sc.nextInt();
            System.out.println(num);
        }

            public  static Scanner methodReturn(){
                //一般格式
        //        Scanner sc=new Scanner(System.in);
        //        return sc;
                return  new Scanner(System.in);
            }



        }

                }

}

Random
{
        参数随机数
        Random类用来生成随机数
        三个步骤
        1.导包
        import java.util.Random;
        2.创建
                Random r=new Random();
        3.使用
        获取一个随机数字
        获取一个随机的int数字（范围是int所有范围），
        int a=r.nextInt();
        获取一个有范围的随机数字,参数代表了范围，左闭右开区间
        int b=r.nextInt(3);
        实际上代表的含义是[0,3),也就是0到2，3取不到


Example：猜数字
package Demo07;
/*
题目：猜数字小游戏

思路：
1.首先随机参数一个随机数字，并且一旦产生就不会发生变化，使用Random的nextInt()参数随机数
2.需要键盘输入，所以用到了Scanner
3.获取键盘输入的数据，使用Scanner中的nextInt()方法
4.已经得到了两个数字，需要if判断一下
    4.1.如果太大了，提示太大，并且重试
    4.2.如果太小，提示太小，并且重试
    4.3如果猜中，游戏结束
5.重试就是再来一次，循环，次数不确定，用while(true)
*/

import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r=new Random();
        //产生的随机数
        int RandomNum=r.nextInt(100)+1;//1-100

        //获取键盘输入的猜测数

        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("输入你猜的数字");
            int guessNum = sc.nextInt();


            if (guessNum > RandomNum) {
                System.out.println("猜大了，请重试");
            } else if (guessNum < RandomNum) {
                System.out.println("猜小了，请重试");
            } else{
                System.out.println("恭喜你，猜对了");break;
            }
        }

    }


}







}

ArrayList集合
{

            * 数组长度不可随意改变，ArrayList大小可以随意改变
            *对于 ArrayList<E>
            E代表泛型，泛型也就是装载集合中的元素，全部都是统一什么类型
            * 泛型只能是引用类型，不能是基本类型
            *
            * 注意：对于ArrayList直接打印，得到不是地址，是内容，如果为空，显示一个[]
            *根据尖括号泛型内容确定添加类型元素；
            * 从JDK1.7开始，右边尖括号里面内容可以不写，尖括号还要写  


            * Arraylist常用方法
            * public booolean(E e)向集合当中添加元素，参数类型与泛型一致
            * 备注：对应ArrayList集合来说，添加集合元素，一定是成功的，所以返回值可用可不要
            * 但是对于其他集合，add添加方法不一定成功
            *
            * public E get(int index);从集合当中获取元素，参数是索引编号，返回值是对应位置元素
            * public E remove(int index);从集合当中删除元素，参数是索引编号，返回值就是那个被删除的元素
            * public int size;获取集合尺寸长度，返回值是集合中包含元素个数
            *
格式
{
      ArrayList<String> list=new ArrayList<>();

     向集合中添加数据
       对象名称.add

}

添加基本数据类型

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
        自动装箱：基本类型->包装类型

        自动拆箱：包装类型->基本类型


案例
        {
            * 生成6个1—33的随机整数，添加到集合，并遍历集合
        *
        *
        *思路：
        * 1.循环存储6个数字，创建一个集合（Integer）
        * 2.产生随机数，需要用到random
        * 用循环6次，来参数6个数字，for循环
        * 循环内调用r.nextInt(int x)方法，参数33，范围0-32，整体加1
        * 把数字添加到集合add
        * 遍历集合，for，size，get
        *

        public class Demo01ArrayListRandom {
         public static void main(String[] args) {
        
        ArrayList<Integer> list=new ArrayList<>();
        Random r=new Random();
        //产生6个随机数
        for (int i = 0; i < 6; i++) {
            int num=r.nextInt(33)+1;
            list.add(num);
        }
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}

        }

        遍历方式
        {
             for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println("姓名："+stu.getName()+"年龄："+stu.getAge());
        }
        }

}

字符串
{
            
        java.lang.String
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



        * 字符串常量值，程序当中直接用双引号写上的字符串，就在字符串常量池中
        * 对于基本常量来说，==就是进行【数值】的比较；
        * 对于引用常量来说，==是进行【地址值】的比较；
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

         String str5=null;
        System.out.println("abc".equals(str5));//flase
      //System.out.println(str5.equals("abc"));
      //报错，是空指针(NullPointerException)，所以推荐字符串在前
        

//   下面这种写法，字符串的内容仍然是没有改变的
        // 下面有两个字符串："Hello"，"Java"
        // strA当中保存的是地址值。
        // 本来地址值是Hello的0x666，
        // 后来地址值变成了Java的0x999
        String strA = "Hello";
        System.out.println(strA); // Hello
        strA = "Java";
        System.out.println(strA); // Java

    String当中与获取相关的常用方法有：

    public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
    public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串。
    public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始。）
    public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。

实例：
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


            String当中与转换相关的常用方法有：

        public char[] toCharArray()：将当前字符串拆分成为字符数组作为返回值。
        public byte[] getBytes()：获得当前字符串底层的字节数组。
        public String replace(CharSequence oldString, CharSequence newString)：
        将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串。
        备注：CharSequence意思就是说可以接受字符串类型。


            
        String当中与转换相关的常用方法有：

        public char[] toCharArray()：将当前字符串拆分成为字符数组作为返回值。
//转换为字符数组
        char[] chars = "hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("===========");


        public byte[] getBytes()：获得当前字符串底层的字节数组。
        byte[] bytes = "abc".getBytes();
                for (int i = 0; i < bytes.length; i++) {
                    System.out.println(bytes[i]);
                }
                System.out.println("=========");
        public String replace(CharSequence oldString, CharSequence newString)：
                将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串。
                备注：CharSequence意思就是说可以接受字符串类型。
  //字符串的内容替换
        String str1="how do you do";
        String str2 = str1.replace("o", "e");
        System.out.println(str1);
        System.out.println(str2);


        String lang1="会不会玩，你大爷的，，你大爷的，你大爷的，你大爷的，你大爷的";
        String lang2=lang1.replace("大爷","**");
        System.out.println(lang2);


        字符串转换为单个字符
        { 
            Scanner sc=new Scanner(System.in);
        System.out.print("清输入一个字符串：");
        String input=sc.next();//获取一个字符串
            char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch=charArray[i];//获取单个字符
        }
        }

}

static关键字
{
    /*如果一个成员变量使用static关键字，那么变量不再属于对象自己，
    而是属于对象所在的类，多个对象共享一份数据*/
}