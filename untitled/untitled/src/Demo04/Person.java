package Demo04;

public class Person {

    String name;
/*
参数name是对方名字
    成员变量是自己的名字
    同名情况，根据就近原则，优先使用成员变量
    解决办法
    this.成员变量名
    解决重名分不开情况
    通过谁调用方法，谁就是this
      person.sayhello("王思聪");
      所以是Person中name
    */
    public  void sayhello(String name){
        System.out.println(name+"你好，我是"+this.name);
        System.out.println(this);

    }
}
