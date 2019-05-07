package object;

public class Demo01PhoneOne {
    public static void main(String[] args) {
//        根据phone类创建一个one对象
    Phone one=new Phone();
        System.out.println(one.brand);//null
        System.out.println(one.color);//0.0
        System.out.println(one.price);//null
        System.out.println("==========");
    one.brand="苹果";
    one.color="黑色";
    one.price=7328.12;
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("==========");

one.call("zza");
one.sendMessage();
    }

}
