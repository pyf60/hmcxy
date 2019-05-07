package object;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two=getPhone();
        System.out.println(two.brand);
        System.out.println(two.color);
//        在java中的格式化字符串规定所有浮点数都是%f，没有%f和%lf的区别了，所以把”lf“改成“f”就可以了。
//        System.out.printf("%f",two.price);
//        修改为println即可
        System.out.println(two.price);
        getnumber(99);
    }

    public  static Phone getPhone(){
        Phone one=new Phone();
        one.brand="苹果";
        one.color="黑色";
        one.price=7328.00;

        return  one;
    }
    public static void getnumber(int num){
        System.out.println("获取到的数据是："+num);
    }
}
