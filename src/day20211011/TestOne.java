package day20211011;

import java.util.Arrays;
import java.util.Scanner;

public class TestOne {
    //有一个有序数字序列，从小到大排序，将一个新输入的数插入到序列中，
    // 保证插入新数后，序列仍然是升序。
    //共三行，
    //第一行输入一个整数(0≤N≤50)。
    //第二行输入N个升序排列的整数，输入用空格分隔的N个整数。
    //第三行输入想要进行插入的一个整数。
    public static void main1(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len+1];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        int item = sc.nextInt();
        arr[len]=item;
        Arrays.sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }






    public static void main2(String args[]){
        //程序分析：不管三七二十一直接将数放进数组，然后进行整体的排序即可
        Scanner scan=new Scanner(System.in);
        int res[]=new int[scan.nextInt()+1];
        //初始化数组 注意！！数组的长度是输入的数字长度再加 1
        for(int i=0;i<res.length-1;i++){
            res[i]=scan.nextInt();//通过循环将数字放进数组
        }
        res[res.length-1]=scan.nextInt();
        Arrays.sort(res);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }






    public static void main3(String[] args) {
        //用户登录网站，通常需要注册，一般需要输入两遍密码。
        // 请编程判断输入的两次密码是否一致，一致输出“same”，不一致输出“different”
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();//输入密码
        String s2 = sc.next();//重复密码
        if(s1.contains(s2)){//contains方法判断元素是否存在
            System.out.println("same");
        }else{
            System.out.println("different");
        }
    }






    public static void main4(String[] args) {
        //输入NxM矩阵，矩阵元素均为整数，计算其中大于零的元素之和
        //第一行为N M(N: 矩阵行数；M: 矩阵列数,且M,N<=10)，接下来的N行为矩阵各行。
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n*m;i++){
            int num = sc.nextInt();
            if(num>0){
                sum+=num;
            }
        }
        System.out.println(sum);

    }






    public static void main5(String[] args) {
        //输入10科成绩，换行显示输入的10科成绩。
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");//使用split方法将字符串分割
        for(String x:s){
            System.out.print(x+" ");
        }
    }




    public static void main6(String[] args) {
        //输入10个整数，要求按输入时的逆序把这10个数打印出来。
        // 逆序输出，就是按照输入相反的顺序打印这10个数。
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sr = s.split(" ");//一行，输入10个整数（范围-231~231-1），用空格分隔。
        for(int i = sr.length-1;i>=0;i--){
            System.out.print(sr[i]+" ");
        }

    }


    public static void main7(String[] args) {
        //输入10个整数，分别统计输出正数、负数的个数。
//        输入：
//        -1 2 3 -6 7 8 -1 6 8 10
//        输出：
//        positive:7
//        negative:3
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int count1 = 0;//统计正数的个数
            int count2 = 0;//统计负数的个数
            for(int i=0;i<10;i++){
                int num = sc.nextInt();
                if(num>0){
                    count1++;
                }else if(num<0){
                    count2++;
                }
            }
            System.out.println("positive:"+count1);
            System.out.println("negative:"+count2);
        }

    }


    public static void main(String[] args) {
        //有序数列插入一个整数
        //有一个有序数字序列，从小到大排序，将一个新输入的数插入到序列中，保证插入新数后，序列仍然是升序。
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int insertNum = sc.nextInt();
            int [] newArr = new int[n+1];
            int insertIndex = n;
            for(int i = 0;i<n;i++){
                if(insertNum<arr[i]){
                    insertIndex=i;
                    break;
                }
            }
            for(int i=0;i<n+1;i++){
                if(i<insertIndex){
                    newArr[i]=arr[i];
                }else if(i==insertIndex){
                    newArr[i]=insertNum;
                }else{
                    newArr[i]=arr[i-1];
                }
            }
            for(int i=0;i<n+1;i++){
                System.out.print(newArr[i]+" ");
            }
        }
    }






}
