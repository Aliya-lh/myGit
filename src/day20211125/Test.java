package day20211125;
/**包装类
 * 装箱（装包）:把简单数据类型->包装类型
*   1、自动装箱
*   2、手动装箱
*
*   拆箱（拆包）：把包装类型->简单类型的过程
*   1、自动拆箱
*   2、自动拆箱
 *

 */
public class Test {
    public static void main(String[] args) {
        //笔试题练习
        Integer a = 100;
        Integer b = 100;
        System.out.println(a==b);
    }



    public static void main2(String[] args) {//拆箱
        Integer a = 10;
        int i = a;//自动拆箱
        int a2 = a.intValue();//手动拆箱 Integer->int
        double d = a.doubleValue();//可以拆成各种简单类型
        byte b = a.byteValue();
    }

    public static void main1(String[] args) {//装箱
        int i =10;
        Integer a = i;//自动装箱
        Integer a2 = Integer.valueOf(i);//手动装箱
        System.out.println(a2);
    }
}
