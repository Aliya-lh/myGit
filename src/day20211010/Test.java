package day20211010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;






public class Test {
   //输入数字N，然后输入N个数，计算这N个数的和。
   //第一行输入一个整数N(0≤N≤50)，第二行输入用空格分隔的N个整数。
   public static void main1(String[] args){
       Scanner sc = new Scanner(System.in);
       String m = sc.nextLine();
       String s = sc.nextLine();
       String[] integer = s.split(" ");
       Integer sum = 0;
       for(String i:integer){
           sum = sum+Integer.parseInt(i);
       }
       System.out.println(sum);
   }


















    public static void main2(String[] args) {
        //输入n个成绩，换行输出n个成绩中最高分数和最低分数的差。
//        两行，第一行为n，表示n个成绩，不会大于10000。
//        第二行为n个成绩（整数表示，范围0~100），以空格隔开
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            System.out.println(Collections.max(list) - Collections.min(list));
        }
    }

















        public static void main(String[] args){
            //输入一个整数序列，判断是否是有序序列，有序，指序列中的整数从小到大排序或者从大到小排序(相同元素也视为有序)。
            //第一行输入一个整数N(3≤N≤50)。
            //第二行输入N个整数，用空格分隔N个整数。
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                int n = sc.nextInt();
                int pre = sc.nextInt();
                int flag = 0;
                boolean judge = true;
                for(int i=1;i<n;i++){
                    int cur = sc.nextInt();
                    if(cur-pre>=0&&flag>=0){
                        flag = 1;
                    }else if(cur-pre<=0&&flag<=0){
                        flag = -1;
                    }else{
                        judge = false;
                    }
                    pre = cur;
                }
                if(judge){
                    System.out.println("sorted");
                }else{
                    System.out.println("unsorted");
                }
            }
        }


















    }










