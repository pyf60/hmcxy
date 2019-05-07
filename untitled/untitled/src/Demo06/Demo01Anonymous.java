package Demo06;
/*创建对象标准格式
* 类名称 对象名=new 类名称（）;
*
*
* 匿名对象就是只有右边的对象，没有左边的名字
* 格式
* new 类名称（）;
* 匿名对象只能使用唯一一次，下次再用不得不再创建一个新对象
* 使用建议：如果确定一个对象只需要使用一次，就可以使用匿名对象
*
* */
public class Demo01Anonymous {
    public static void main(String[] args) {
        //左边one就是对象名字
        Person one=new Person();
        one.name="gaoyuanyuan";
        one.showName();
        //匿名对象
        new Person().name="zhaoyouting";
        new Person().showName();
    }

}
