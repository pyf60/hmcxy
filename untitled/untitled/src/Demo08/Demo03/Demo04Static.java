package Demo08.Demo03;
/*
 * 静态代码块的格式
 * public class 类名称{
 *   static{
 * //静态代码块
 *
 * }
 * }
 * 特点：当第一次用到本类时，静态代码块执行唯一的一次，第二次使用就不再执行
 * 1.静态内容总是优先非静态，所以静态代码块比构造方法先执行
 *
 * */
public class Demo04Static {

    public static void main(String[] args) {
        Person one=new Person();
//        静态方法执行一次，构造方法用到一次，运行一次
        Person two=new Person();
    }
}
