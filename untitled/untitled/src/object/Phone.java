package object;
//属性：品牌，价格，颜色
//行为：打电话，发短信
/*成员变量
String brand;
double price;
String color;
成员行为（方法）
public void call*/
public class Phone {
    //成员变量
    String brand;
    double price;
    String color;

//    成员方法

    public  void  call(String who){
        System.out.println("给"+who+"打电话");
    }
    public  void sendMessage(){

        System.out.println("群发短信");
    }


}
