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