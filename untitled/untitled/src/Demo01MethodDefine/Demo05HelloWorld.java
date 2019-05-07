package Demo01MethodDefine;
//打印指定次数的hello'world
public class Demo05HelloWorld {
    public static void main(String[] args) {
        printCount(10);
    }
/*三要素
* 返回值类型：
* 方法名称：printcount
* 参数列表：打印多少次**/

public  static void printCount(int num){
    for (int i = 0; i < num; i++) {
        System.out.println("helloworld:"+(i+1));
    }
}


}
