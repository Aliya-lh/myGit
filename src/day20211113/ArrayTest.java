package day20211113;


import java.util.Arrays;
class Calculator{
    //编写一个Calculator类，有两个属性num1，num2，这两个数据的值，不能在定义的同时初始化，最后实现加减乘除四种运算
    private int num1;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    private int num2;

     public int add(){
         //加法
         return this.num1 + this.num2;
     }
     public int sub(){
         //减法
         return this.num1 - this.num2;
     }
     public int mul(){
         //乘法
         return this.num1 * this.num2;
     }
     public double dev(){
         //除法
         return this.num1*1.0 / this.num2;
     }

}


public class ArrayTest {
    public static void main(String[] args) {
        //交换两个变量的值，要求交换实参的值



    }

    public static void main2(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setNum1(10);
        calculator.setNum2(20);
        System.out.println("加法");
        System.out.println(calculator.add());
        System.out.println("减法");
        System.out.println(calculator.sub());
        System.out.println("乘法");
        System.out.println(calculator.mul());
        System.out.println("除法");
        System.out.println(calculator.dev());

    }




    public static void SwapArray1(int[] array1,int[] array2){
        for(int i=0;i<array1.length;i++){
            //遍历数组1并且交换两个数组的值
            int tmp = array1[i];
            array1[i] = array2[i];
            array2[i] = tmp;
        }
    }

    //给定两个整型数组，交换两个数组的内容
    public static void main1(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {12,23,34,45,56,67};
        SwapArray1(array1,array2);
        System.out.println("int[] array1 = "+Arrays.toString(array1));
        System.out.println("int[] array2 = "+Arrays.toString(array2));
    }
}
