package Demo03;
/*封装性:将一些细节信息隐藏起来
* 继承性
* 多态性
*
* 1.方法就是一种封装
* 1.private就是一种封装
* */
public class Demo02Method {

    public static void main(String[] args) {
        int[] array={5,15,25,35,45};
     int max= getMax(array);
        System.out.println("最大值"+max);

    }

//    获取一个数组，得出最大值
    public  static  int getMax(int[] array){
        int max= array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max)
                max=array[i];

        }
        return  max;
    }
}
