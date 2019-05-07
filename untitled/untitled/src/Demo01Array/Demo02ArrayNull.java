package Demo01Array;
//所以的引用类型变量，都可以赋值为一个NUll值，但是代表什么都没有
/*数组必须进行new初始化，才能使用其中的元素，
        如果只是赋值null，没有进行new创建，那么将会空指针异常
        NullPointerException*/
/*原因 ：忘记new
措施：补上new*/
public class Demo02ArrayNull {
    public static void main(String[] args) {
        int[] Array=null;
        Array=new int[5];
        System.out.println(Array[0]);
    }
}
