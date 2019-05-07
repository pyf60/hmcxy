package Demo07;
/*d定义一个数组，存储三个对象*/
//一旦创建，程序运行空间就不可改变
public class Demo01Array {
    public static void main(String[] args) {
        Person[] array=new Person[3];

        System.out.println(array);
        Person one=new Person("dilireba",14);
        Person two=new Person("gulinaza",23);
        Person three=new Person("maerzhate",34);

        array[0]=one;
        array[1]=two;
        array[2]=three;
        System.out.println(array[0].getName());
        System.out.println(array[1].getName());
        System.out.println(array[2].getName());
    }
}
