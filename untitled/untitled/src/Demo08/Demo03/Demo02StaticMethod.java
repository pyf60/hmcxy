package Demo08.Demo03;
/*一旦使用static修饰成员方法，这就成为静态方法，静态方法不属于对象，而是属于类
* 如果没有static关键字，必须先创建对象来使用方法
*
* 无论是成员变量还是成员方法，如果使用了static关键字，都推荐使用类名称进行调用
* 静态变量  类名称.静态变量
* 静态方法  类名称.静态方法
*
*
* 注意事项：
* 1.静态只能直接访问，不能访问非静态
* 因为在内存当中先有静态内容，后有非静态
* 先人不知道后人，后人知道先人
* 2.静态方法当中不能用this，原因：通过谁调用的方法，谁就是当前对象，对象和静态无关系
*3.静态变量只和类有关系
* */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        Myclass obj=new Myclass();//首先创建对象

        obj.Method();
//        然后才能使用没有static的关键字内容
//    对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称进行调用
    obj.methodStatic();//正确，不推荐    对象.方法名,这种写法会自动翻译成类名称.方法名
        Myclass.methodStatic();//正确，推荐   类名.方法名
//        对于本来当中的静态方法，可以省略类名称
myMethod();
//但是实际是
        Demo02StaticMethod.myMethod();//两个完全等效
    }

    public  static  void myMethod(){
        System.out.println("自己的方法");
    }
}
