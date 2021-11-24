package day20211122;

import java.lang.management.MemoryType;
import java.util.Arrays;

//顺序表
public class MyArrayList {

    public int[] elem;//数组 顺序表里放什么类型元素取决于数组是什么类型
    public int usedSize;//有效的数据个数
    public static final int intCapacity = 10;//初始容量

    public MyArrayList(){
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }


    public void display(){
        //打印顺序表
        for(int i=0;i<this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }


    private boolean isFull(){
        if(this.usedSize == this.elem.length){
            return true;
        }
        return false;
    }


    private void checkPos(int pos){//判断pos合法性的方法
        if(pos<0 || pos>this.usedSize){//判断pos是否合法
           throw new RuntimeException("pos位置不合法！");
        }
    }

    //在pos位置新增元素(自己实现）
    public void add(int pos,int data){
        checkPos(pos);

        if(isFull()){
            //二倍扩容
           this.elem =
                   Arrays.copyOf(this.elem,2*this.elem.length);
            //return;
        }

//        if(pos<0 || pos>this.usedSize){//判断pos是否合法
//            return;
//        }

        for(int i=this.usedSize-1;i>=pos;i++){ //挪数据了
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;

    }

    public void setPos(int pos,int value){
        //将pos位置的元素换为value
        checkPos(pos);
        this.elem[pos] = value;
    }


    public boolean contains(int toFind) {
        //判断是否含有某个元素
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;

    }

    public int search(int toFind){
        //查找某个元素对应的位置
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    private boolean isEmpty() {//判断顺序表是否为空
        return this.usedSize == 0;
    }

    public int getPos(int pos){
        //获取pos位置的元素
        //步骤：
        //1、判断顺序表是否为空
        //2、pos合法性

        //return pos位置的数据就ok了
        if(isEmpty()){
            //return -1;//不能返回-1 有可能数组里面有-1
            throw new RuntimeException("顺序表为空！");//手动抛出异常
        }

        if(pos<0 || pos>=this.usedSize){//注意！！pos此时也不能拿到this.usedSize位置的下标
            return -1;
        }
       return this.elem[pos];
}


    public int size(){
        //获取顺序表长度
        return this.usedSize;
    }


    public void remove(int toRemove){
        //删除第一次出现的关键字toRemove
        //1、找出toRemove的位置下标
        //2、[i] = [i+1]
        //3、usedSize--

        int index = search(toRemove);
        if(index == -1){
            System.out.println("没有需要删除的数字！");
            return;// return是退出，不能不加，否则代码继续向下执行，index越界报错
        }

        for(int i = index;i<this.usedSize-1;i++){
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;

    }



    public void clear(){
        //清空顺序表
        this.usedSize = 0;
    }



    public static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList();
//        myArrayList.add(0,12);
//        myArrayList.add(1,23);
//        myArrayList.add(2,34);
//        myArrayList.add(3,45);
        for(int i=0;i<10;i++){
            myArrayList1.add(i,i);
        }
        myArrayList1.display();
        myArrayList1.add(10,112);
        myArrayList1.display();
        System.out.println("================");
        System.out.println(myArrayList1.search(5));
        System.out.println(myArrayList1.contains(5));
        myArrayList1.remove(112);
        myArrayList1.display();
        System.out.println("clear()清除");
        myArrayList1.clear();
        myArrayList1.display();
    }
}
