package day20211127;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 * List的使用
 *
 * 迭代器 Iterator
 * 迭代器要使用，必须实现Iterable接口
 */
public class TestDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
    }


    public static void main3(String[] args) {
        //构造ArrayList对象三种方法：
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(30);
        ArrayList<Integer> list3 = new ArrayList<>(list1);
    }


    public static void main2(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        System.out.println(list);

        int x = list.remove(1);//打印出1下标要remove的元素
        System.out.println(x);

//        boolean flg = list.remove(22); 报错！将22当作下标了
 //       boolean flg = list.remove(list.get(1));//正确写法 实际情况中不会给list放整数而是对象！
  //      System.out.println(flg);
        System.out.println(false);

        list.set(1,100);//将1下标处的值替换成100
        System.out.println(list);

        list.clear();//清空
        System.out.println(list);

       boolean flg1 = list.contains(11);//是否包含某个元素
        System.out.println(flg1);


        list.indexOf(22);//返回第一个o所在的下标
        System.out.println(list);
        list.lastIndexOf(22);//返回最后一个o所在的下标
        System.out.println(list);

        List<Integer> elist= list.subList(1,4);//截取部分list
        /*注意：
         * 1、subList(1,4) ->[1,4) 是左闭右开的
         * 2、subList并不是截取出来的一个新的数组，而是原来的数组
         */
        System.out.println(elist);
        elist.set(1,133);
        System.out.println("修改截取的"+elist);
        System.out.println("原来的"+list);

    }








    public static void main1(String[] args) {
        //底层是一个顺序表
        List<Integer> list = new ArrayList<>();//List是接口
        //问题：1、当前的ArrayList大小为多少？
        // 当前的ArrayList大小为0，并没有分配空间
        //2、既然当前大小为0，那么add怎么能把数据放进去？

        list.add(10);
        list.add(0,20);
        ArrayList<Integer> list2 = new ArrayList<>();//ArrayList是一种具体类型
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list.addAll(list2);//添加list2整体 注意！！add、addAll要添加同类型的
        System.out.println(list);
        System.out.println("=================");

        //迭代器
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            //it.remove();
            // TODO：去查资料了解it.remove()需要注意的问题

            System.out.println("==================");
            for(Integer x:list){
                //可以通过for-each方式遍历list或者ArrayList集合
            }
        }
    }
}
