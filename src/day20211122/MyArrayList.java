package day20211122;

import java.lang.management.MemoryType;

//顺序表
public class MyArrayList {

    public int[] elem;//数组
    public int usedSize;//有效的数据个数
    public static final int intCapacity = 10;//初始容量

    public MyArrayList(){
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }

    //打印顺序表
    public void display(){

    }
    //在pos位置插入一个元素
    public void add(int pos,int data){

    }
    public boolean contains(int toFind){
        return true;
        //判断是否含有某个元素
    }

    public int search(int toFind){
        return -1;
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        MyArrayList myArrayList1 = new MyArrayList();
    }
}
