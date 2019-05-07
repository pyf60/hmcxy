package Demo07;

import java.util.ArrayList;

/*
* 数组长度不可随意改变，ArrayList大小可以随意改变
*对于 ArrayList<E>
E代表泛型，泛型也就是装载集合中的元素，全部都是统一什么类型
* 泛型只能是引用类型，不能是基本类型
*
* 注意：对于ArrayList直接打印，得到不是地址，是内容，如果为空，显示一个[]
*根据尖括号泛型内容确定添加类型元素；
* */
public class Demo02ArrayList {

    public static void main(String[] args) {

        /*创建一个ArrayList，集合名称是list，里面全部都是String类型
        * 从JDK1.7开始，右边尖括号里面内容可以不写，尖括号还要写*/
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);//[],对于ArrayList直接打印，得到不是地址，是内容，如果为空，显示一个[]
        //向集合中添加数据
//        对象名称.add
        //因为尖括号泛型定义的是String，所以添加进去元素必须是字符串，否则出现错误
        list.add("赵丽颖");
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");
        System.out.println(list);


    }
}
