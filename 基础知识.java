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

ArrayList����
{

            * ���鳤�Ȳ�������ı䣬ArrayList��С��������ı�
            *���� ArrayList<E>
            E�����ͣ�����Ҳ����װ�ؼ����е�Ԫ�أ�ȫ������ͳһʲô����
            * ����ֻ�����������ͣ������ǻ�������
            *
            * ע�⣺����ArrayListֱ�Ӵ�ӡ���õ����ǵ�ַ�������ݣ����Ϊ�գ���ʾһ��[]
            *���ݼ����ŷ�������ȷ���������Ԫ�أ�
            * ��JDK1.7��ʼ���ұ߼������������ݿ��Բ�д�������Ż�Ҫд  


            * Arraylist���÷���
            * public booolean(E e)�򼯺ϵ������Ԫ�أ����������뷺��һ��
            * ��ע����ӦArrayList������˵����Ӽ���Ԫ�أ�һ���ǳɹ��ģ����Է���ֵ���ÿɲ�Ҫ
            * ���Ƕ����������ϣ�add��ӷ�����һ���ɹ�
            *
            * public E get(int index);�Ӽ��ϵ��л�ȡԪ�أ�������������ţ�����ֵ�Ƕ�Ӧλ��Ԫ��
            * public E remove(int index);�Ӽ��ϵ���ɾ��Ԫ�أ�������������ţ�����ֵ�����Ǹ���ɾ����Ԫ��
            * public int size;��ȡ���ϳߴ糤�ȣ�����ֵ�Ǽ����а���Ԫ�ظ���
            *
��ʽ
{
      ArrayList<String> list=new ArrayList<>();

     �򼯺����������
       ��������.add

}

��ӻ�����������

        * ���ϣ����ArrayList������ӻ������ͣ���Ҫʹ�û������͵İ�װ��
        * �������� ��װ�ࣨ�������ͣ���װ�඼Ϊ��java.lang����
        * byte      Byte
        * int       Integer
        * long      Long
        * short     Short
        * double    Double
        * float      Float
        * char      Character
        * boolean   Boolean
        *
        *
        �Զ�װ�䣺��������->��װ����

        �Զ����䣺��װ����->��������


����
        {
            * ����6��1��33�������������ӵ����ϣ�����������
        *
        *
        *˼·��
        * 1.ѭ���洢6�����֣�����һ�����ϣ�Integer��
        * 2.�������������Ҫ�õ�random
        * ��ѭ��6�Σ�������6�����֣�forѭ��
        * ѭ���ڵ���r.nextInt(int x)����������33����Χ0-32�������1
        * ��������ӵ�����add
        * �������ϣ�for��size��get
        *

        public class Demo01ArrayListRandom {
         public static void main(String[] args) {
        
        ArrayList<Integer> list=new ArrayList<>();
        Random r=new Random();
        //����6�������
        for (int i = 0; i < 6; i++) {
            int num=r.nextInt(33)+1;
            list.add(num);
        }
        //��������
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}

        }

        ������ʽ
        {
             for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println("������"+stu.getName()+"���䣺"+stu.getAge());
        }
        }

}

�ַ���
{
            
        java.lang.String
        String ������ַ�����Java �����е������ַ�������ֵ���� "abc" ������Ϊ�����ʵ��ʵ�֡�
        ��ʵ����˵�������е����е�˫�����ַ���������String���ͣ�������û��new������String�ַ�����

        �ַ������ص㣺
        1���ַ��������ݲ��ɸı�
        2��������Ϊ�ַ������ɸı䣬�����ַ������Թ���ʹ��
        3���ַ���Ч�����൱��char[]���ַ����飬�ײ�ԭ����byte[]���ֽ�����


        �����ַ����ĳ���3+1�ַ�ʽ
        ���ֹ��췽��
        public String(),����һ���հ��ַ������������κ�����
        public String��char[] array�� �����ַ���������ݣ�������ָ�����ַ���
        public String��byte[] array�������ֽ���������ݣ�������ָ�����ַ���
        1��һ��ֱ�Ӵ���
        String Str="abc";
        ע�⣺ֱ��д��˫���ţ�����һ���ַ�������



        * �ַ�������ֵ��������ֱ����˫����д�ϵ��ַ����������ַ�����������
        * ���ڻ���������˵��==���ǽ��С���ֵ���ıȽϣ�
        * �������ó�����˵��==�ǽ��С���ֵַ���ıȽϣ�
        * ==�Ƕ����ֵַ���бȽϣ����ȷʵ��Ҫ�ַ������ݵıȽϣ�����ʹ����������
        * public boolean equals(Object obj)����Object���Ϳ������κζ���
        * ֻ�в�����һ���ַ�������������ͬ�Ż��һ��ture
        *
        * ע�����
        * �κζ��󶼿�����Object���н���
        *equals������a.equals(b)��b.equals(a)Ч��һ��
        * ����Ƚ�һ��������һ���������Ƽ����ַ���д��ǰ�棬�ַ���ʹ��˫����
        *
        * public boolean equals(str)//���Դ�Сд�����ַ����ıȽ�

         String str5=null;
        System.out.println("abc".equals(str5));//flase
      //System.out.println(str5.equals("abc"));
      //�����ǿ�ָ��(NullPointerException)�������Ƽ��ַ�����ǰ
        

//   ��������д�����ַ�����������Ȼ��û�иı��
        // �����������ַ�����"Hello"��"Java"
        // strA���б�����ǵ�ֵַ��
        // ������ֵַ��Hello��0x666��
        // ������ֵַ�����Java��0x999
        String strA = "Hello";
        System.out.println(strA); // Hello
        strA = "Java";
        System.out.println(strA); // Java

    String�������ȡ��صĳ��÷����У�

    public int length()����ȡ�ַ������к��е��ַ��������õ��ַ������ȡ�
    public String concat(String str)������ǰ�ַ����Ͳ����ַ���ƴ�ӳ�Ϊ����ֵ�µ��ַ�����
    public char charAt(int index)����ȡָ������λ�õĵ����ַ�����������0��ʼ����
    public int indexOf(String str)�����Ҳ����ַ����ڱ��ַ��������״γ��ֵ�����λ�ã����û�з���-1ֵ��

ʵ����
 public static void main(String[] args) {
//        public int length()����ȡ�ַ������к��е��ַ��������õ��ַ������ȡ�
        int length = "hkjsdhfksdhfksdhfls".length();
        System.out.println(length);

        //ƴ���ַ���
        String str="hello";
        String str2="world";
        String str3=str.concat(str2);
//        �ַ������ɸı䣬ֻ���´���
        System.out.println(str);//helloԭ�ⲻ��
        System.out.println(str2);//worldԭ�ⲻ��
        System.out.println(str3);//helloworld,���²������ַ���
//      ��ȡָ��λ�õĵ����ַ�
        char e = "hello".charAt(1);
        System.out.println(e);
//        ���Ҳ����ַ����ڱ����ַ�����һ�γ��ֵ�����δ֪
//        �������û�з���ֵ-1
        String original="helloworld";
        int index = original.indexOf("llo");
        System.out.println("��һ�γ�������"+index);//2
        System.out.println(original.indexOf("kjh"));//û��-1

    }


            String������ת����صĳ��÷����У�

        public char[] toCharArray()������ǰ�ַ�����ֳ�Ϊ�ַ�������Ϊ����ֵ��
        public byte[] getBytes()����õ�ǰ�ַ����ײ���ֽ����顣
        public String replace(CharSequence oldString, CharSequence newString)��
        �����г��ֵ����ַ����滻��Ϊ�µ��ַ����������滻֮��Ľ�����ַ�����
        ��ע��CharSequence��˼����˵���Խ����ַ������͡�


            
        String������ת����صĳ��÷����У�

        public char[] toCharArray()������ǰ�ַ�����ֳ�Ϊ�ַ�������Ϊ����ֵ��
//ת��Ϊ�ַ�����
        char[] chars = "hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("===========");


        public byte[] getBytes()����õ�ǰ�ַ����ײ���ֽ����顣
        byte[] bytes = "abc".getBytes();
                for (int i = 0; i < bytes.length; i++) {
                    System.out.println(bytes[i]);
                }
                System.out.println("=========");
        public String replace(CharSequence oldString, CharSequence newString)��
                �����г��ֵ����ַ����滻��Ϊ�µ��ַ����������滻֮��Ľ�����ַ�����
                ��ע��CharSequence��˼����˵���Խ����ַ������͡�
  //�ַ����������滻
        String str1="how do you do";
        String str2 = str1.replace("o", "e");
        System.out.println(str1);
        System.out.println(str2);


        String lang1="�᲻���棬���ү�ģ������ү�ģ����ү�ģ����ү�ģ����ү��";
        String lang2=lang1.replace("��ү","**");
        System.out.println(lang2);


        �ַ���ת��Ϊ�����ַ�
        { 
            Scanner sc=new Scanner(System.in);
        System.out.print("������һ���ַ�����");
        String input=sc.next();//��ȡһ���ַ���
            char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch=charArray[i];//��ȡ�����ַ�
        }
        }

}

static�ؼ���
{
    /*���һ����Ա����ʹ��static�ؼ��֣���ô�����������ڶ����Լ���
    �������ڶ������ڵ��࣬���������һ������*/
}