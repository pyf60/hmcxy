package Demo08.Demo04;
/*java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。

public static double abs(double num)获取绝对值
public static double ceil（double num）向上取整
public static double floor（double num）向下取整
public static long round（double num）四舍五入*/
//Math.Pi比任何其他值都更接近 pi（即圆的周长与直径之比）的 double 值。
public class Demo03Math {

    public static void main(String[] args) {
//        获取绝对值
        System.out.println(Math.abs(3.123));
        System.out.println(Math.abs(0.0));
        System.out.println(Math.abs(-34));

//        向上取整
        System.out.println(Math.ceil(3.123));

        System.out.println(Math.max(3,4));
//        向下取整
        System.out.println(Math.floor(3.123));
//四舍五入
        System.out.println(Math.round(3.123));
        System.out.println(Math.round(4.7));


        System.out.println(Math.PI);
    }


}
