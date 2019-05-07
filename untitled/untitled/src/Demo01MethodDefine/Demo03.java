package Demo01MethodDefine;
//判断两个数字是否相同
public class Demo03 {

    public static void main(String[] args) {
        System.out.println(isSame(10,20));
        System.out.println(isSame(10,10));
    }
    /*
     * 三要素
     * 返回值类型：Boolean
     * 方法名称：isSame
     * 参数列表int a,int b*/

    public  static  boolean isSame(int a,int b){
       /* boolean same;
//        if (a==b){
//            same=true;
//        }else {
//            same=false;
//        }
        same=a==b;
        return same;*/

        return  a==b;
    }
}
