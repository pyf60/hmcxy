private �ؼ���
{
    ʹ�÷�����ֱ�ӷ��ڳ�Ա������ǰ��

    1. ����ֱ�ӷ��ʣ����ǿ��Լ�ӷ����޸�
    2���޸�ʹ����Ҫͨ��set��get����
    3.set��get������������������
    4.{
        * set�в����޷���
        * get�޲����з���
     }
5.ʹ�÷���
//set
     public  void setName(String name1){
        name=name1;
    }
//get
    public  String getName(){
        return name;
    }
}


this �ؼ���
{
    ��ʽ
    this.��Ա������
    ��������ֲ������
    ͨ��˭���÷�����˭����this
      person.sayhello("��˼��");
      ������Person��name

      ��set��getter������
      this.name=name; ���� ��Ա���� ��ֵ �ֲ�������������������ʹ��ͬһ��������

}



���췽��
{

    ���췽����ʵ����ר��������������ķ�����������ͨ��new�����ؼ��֣���ʵ�����ڵ��ù��췽��


    ��ʽ
    public �����ƣ��������� �������ƣ�{
        ������
            }

    1.���췽�����������������һģһ������СдҲһ��
    2.�޷���ֵ���ͣ���void��û��
    3.���췽������ʹ��return��Ϊ����ֵ
    4.���û�б�д�κι��췽����������Ĭ������һ�����췽����û�в�����������ʲô������
    public Student(){}
    5.һ����д������һ�����췽��������������������
    6.���췽��Ҳ�ǿ�������
    ���أ�����������ͬ�������б�ͬ






}


API
{
    Scanner���м�������
    Scanner sc=new Scanner();


    
        Scanner�����ʵ�ּ����������ݣ���������ȥ
        �������͵�һ��ʹ�ò���
        1������

        import ��·��.������
        �����ǰʹ�õ�Ŀ���࣬�͵�ǰ��λ��ͬһ�����£������ʡ�Ե�����䲻д
        ֻҪjava.lang���µ����ݲ���Ҫ�����������İ�����Ҫimport����
        2������
        ������ ������=new �����ƣ���;

        3��ʹ��
        ������.��Ա����������;


        �Ӽ��̻�ȡһ��int���֣�  int num= sc.nextInt();
        �Ӽ��̻�ȡһ���ַ�����String str=sc.next();
        ע�⣺��ʵ�Ӽ�������Ķ����ַ�����next��ԭ�ⲻ�������nextInt�ǽ�������ַ���ת��Ϊ���֣�intΪ����ֵ

}

������������ֵ
{

    ���������������֣�������ֵ
    *
    * 1.��Ҫ�õ����룬��ҪScanner
    * 2.Scanner�������裺������������ʹ��
    * 3.��Ҫ�������֣���������nextInt�������õ�����int����
    * 4.�޷�ͬʱ�ж����������Ӧ��ץ��Ϊ��������
    *   4.1.ǰ��������˭����õ�ǰ�������ֵ
    *   4.2.����ǰ�����������ֵ��Ȼ������������Ƚϣ��õ����ֵ
    * 5.��ӡ

}


��������
{
        ���������׼��ʽ
        * ������ ������=new �����ƣ���;
        *
        *
        * �����������ֻ���ұߵĶ���û����ߵ�����
        * ��ʽ
        * new �����ƣ���;
        * ��������ֻ��ʹ��Ψһһ�Σ��´����ò��ò��ٴ���һ���¶���
        * ʹ�ý��飺���ȷ��һ������ֻ��Ҫʹ��һ�Σ��Ϳ���ʹ����������


���������ʹ�þ���ʵ��
        {
            
import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
                //��ͨʹ�÷�ʽ
        //        Scanner sc=new Scanner(System.in);
        //        int num=sc.nextInt();

        //    ��������ʽ
        //        int sum= new Scanner(System.in).nextInt();
        //        System.out.println(sum);

        //        ʹ��һ�㷽���������
        //        Scanner sc=new Scanner(System.in);
        //        method(sc);


        //        ʹ���������������д���
            // method(new Scanner(System.in));

        //        ʹ�����������󷵻�ֵ
                Scanner scanner = methodReturn();
                int num= scanner.nextInt();
                System.out.println(num);

            }

        public  static  void  method(Scanner sc){
            int num = sc.nextInt();
            System.out.println(num);
        }

            public  static Scanner methodReturn(){
                //һ���ʽ
        //        Scanner sc=new Scanner(System.in);
        //        return sc;
                return  new Scanner(System.in);
            }



        }

                }

}

Random
{
        ���������
        Random���������������
        ��������
        1.����
        import java.util.Random;
        2.����
                Random r=new Random();
        3.ʹ��
        ��ȡһ���������
        ��ȡһ�������int���֣���Χ��int���з�Χ����
        int a=r.nextInt();
        ��ȡһ���з�Χ���������,���������˷�Χ������ҿ�����
        int b=r.nextInt(3);
        ʵ���ϴ���ĺ�����[0,3),Ҳ����0��2��3ȡ����


Example��������
package Demo07;
/*
��Ŀ��������С��Ϸ

˼·��
1.�����������һ��������֣�����һ�������Ͳ��ᷢ���仯��ʹ��Random��nextInt()���������
2.��Ҫ�������룬�����õ���Scanner
3.��ȡ������������ݣ�ʹ��Scanner�е�nextInt()����
4.�Ѿ��õ����������֣���Ҫif�ж�һ��
    4.1.���̫���ˣ���ʾ̫�󣬲�������
    4.2.���̫С����ʾ̫С����������
    4.3������У���Ϸ����
5.���Ծ�������һ�Σ�ѭ����������ȷ������while(true)
*/

import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r=new Random();
        //�����������
        int RandomNum=r.nextInt(100)+1;//1-100

        //��ȡ��������Ĳ²���

        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("������µ�����");
            int guessNum = sc.nextInt();


            if (guessNum > RandomNum) {
                System.out.println("�´��ˣ�������");
            } else if (guessNum < RandomNum) {
                System.out.println("��С�ˣ�������");
            } else{
                System.out.println("��ϲ�㣬�¶���");break;
            }
        }

    }


}







}