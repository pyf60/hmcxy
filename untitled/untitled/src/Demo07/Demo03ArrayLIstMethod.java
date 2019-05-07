package Demo07;

/*
* Arraylist常用方法
* public booolean(E e)向集合当中添加元素，参数类型与泛型一致
* 备注：对应ArrayList集合来说，添加集合元素，一定是成功的，所以返回值可用可不要
* 但是对于其他集合，add添加方法不一定成功
*
* public E get(int index);从集合当中获取元素，参数是索引编号，返回值是对应位置元素
* public E remove(int index);从集合当中删除元素，参数是索引编号，返回值就是那个被删除的元素
* public int size;获取集合尺寸长度，返回值是集合中包含元素个数
*
* */


import java.util.ArrayList;

public class Demo03ArrayLIstMethod {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);

        //向集合添加元素
        //添加返回值
    boolean success=list.add("赵丽颖");
        System.out.println(list);
        System.out.println("添加元素是否成功"+success);
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");
        System.out.println(list);
        //get获取元素
        String one=list.get(1);
        System.out.println(one);

        //从集合中删除元素
        //具有返回值，并通过remove获取
        String remove = list.remove(3);
        System.out.println("被删除的人是"+remove);
        System.out.println(list);


            //获取大小,也就是元素个数
      int size=  list.size();

        System.out.println(size);
    }
}
