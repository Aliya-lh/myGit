package Generic;


import java.util.ArrayList;

/**泛型笔记：
 * 泛型就是将类型参数化  给类或者方法传类型 与C++的模板是类似的
 * 泛型的标志就是尖括号<>
*问题：如何实现一个通用的顺序表？
 *
 * 1、<T>：代表当前类是一个泛型类
 * 2、 new T[10]:不能 new 泛型类型的数组    这种方式 T[] t = new T[];是错误的
 * 3、泛型的意义：
 *      1)、在存储元素的时候，可以自动进行元素的检查
 *      2)、在获取元素的时候，可以进行自动类型的转换
 * 4、泛型类型的参数不能是简单类型
 * 5、泛型类型的参数，是不参与类型的组成的，也就是说它们不属于类型的一部分
 * 【注意】：泛型是作用在编译期间的一种机制，即运行期间没有泛型的概念
 * 泛型代码在运行期间，就是我们下面提到的，利用Object达到的效果
 *
 * 面试问题：泛型到底是怎么编译的？
 * 1) 泛型只在编译的时候起作用，在运行的时候，是没有泛型的概念的！！
 * 2) 擦除机制 -> 把这个类型擦除成 Object -> 不严谨！！我们可以给擦除边界
 *
 *
 *
 *
 */


class MyArrayList<T>{//一般在此处写<T>或者<E>
    private T[] elem;//T最后其实就是一个Object
    private int usedSize;

    public MyArrayList(){

        this.elem = (T[])new Object[10];
    }

    public void add(T val){

        this.elem[this.usedSize++]=val;
    }
    public T getPos(int pos){

        return this.elem[pos];
    }
}

public class Generic {
    public static void main(String[] args) {
        int i = 10;
        Integer a = i;
    }









    public static void main3(String[] args) {
       MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
       myArrayList.add(1);
       myArrayList.add(2);
       MyArrayList<String> myArrayList1 = new MyArrayList<String>();
       myArrayList1.add("lhhhhh");
    }






    public static void main2(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("lhhhh");
    }

    public static void main1(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add("lhhhh");
        myArrayList.add(1.1);
        String ret = (String)myArrayList.getPos(1);
        System.out.println(ret);

    }



}
