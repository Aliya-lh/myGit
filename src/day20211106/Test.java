package day20211106;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

//String类
//从内存和常用方法来讲
public class Test {
    public static String func3(String str,int n){
        if(str==null||n<=0||n>=str.length()){
            return null;//注意！！一定要对参数进行判断！！！
        }
       str = reverse(str,0,n-1);
       str = reverse(str,n,str.length()-1);
       str = reverse(str,0,str.length()-1);
        return str;
    }
    public static void main(String[] args) {
        //给定一个字符类型的数组chas和一个整数size，请把大小为size的左半区整体右移到右半区，右半区整体移到左边
        //思路：逆置三次
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        String ret = func3(str,n);
        System.out.println(ret);

    }

    public static String reverse(String str,int begin,int end){
        char[] value = str.toCharArray();//先将字符串变为数组！！
        while(begin < end){
            char tmp = value[begin];
            value[begin] =value[end];
            value[end] = tmp;
            begin++;
            end--;
        }
     //return new String(value);第一种方法
        return String.copyValueOf(value);
    }


    public static void main10(String[] args) {
        //实现字符串的逆置 例 "abcd"->"dcba"
        String str = "abcdefg";
        String ret = reverse(str,0,str.length()-1);
        System.out.println(ret);
    }









    public static void main9(String[] args) {
        String str = "abcdefAD";
        String ret = str.toUpperCase();//将字符串转为大写形式 只对字母有效！！
        System.out.println(ret);
    }







    public static String func2(String str){
        String[] strings = str.split(" ");//将字符串分割为两个数组
        //[abc]  [def]
        //0     1
        String ret = "";
        for(String s:strings){
            ret += s;
        }
        return ret;
    }
    public static void main8(String[] args) {
        //可以借用任何的字符串库函数实现无冗余地接受两个字符串，然后把它们无冗余的连接起来，输出连接后的字符串
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();//例：abc def
        //此处不能用next()！！ next()遇到空格就结束了
        String ret = func2(str);
        System.out.println(ret);
    }











    public static void main7(String[] args) {
        String str = "name=zhangsan&age=18";//多次分割
        String[] strings1 = str.split("&");
        //[name=zhangsan]   [age=18]
        //       0              1
        for (String s1:strings1){
            String[] strings2 = s1.split("=");
            for (String s2:strings2){
                System.out.println(s2);
            }
        }
    }






    public static void main6(String[] args) {
        String str = "192.168.1.1";
        String[] strings = str.split("\\.");//注意！！split的返回值类型是String
        for(String s:strings){
            System.out.println(s);
        }
    }







    public static void main5(String[] args) {
        //字符串分割
        String str = "abc de f";
        String[] strings = str.split(" ");//注意！！split的返回值类型是String
        for(String s:strings){
            System.out.println(s);
        }

    }


    public static void main4(String[] args) {
        //通过字节数组来构建一个字符串
        byte[] bytes = {97,98,99,100};
        String str = new String(bytes);
        System.out.println(str);
        String str2 = "abcdef";
        byte[] bytes1 = str2.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes1));
    }


    public static boolean func(String str){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch<'0'||ch>'9'){
                return false;
            }
        }
        return true;


//      char[] val = str.toCharArray();
//      for(int i = 0;i<val.length;i++){
//          if(val[i]>9){
//              return false;
//          }else if(val[i]<9) {
//              return false;
//          }
//      }
//      return true;
    }


    public static void main3(String[] args) {
        String str = "12345a6";
        boolean flg = func(str);
        System.out.println(flg);
    }



    public static void main2(String[] args) {
        String str1 = "hello";//str1和str2都是引用类型，放的都是地址
        String str2 = new String("hello");
        System.out.println(str1 == str2);//false 此处比较的是地址 保存的地址不同

        String str3 = "hello";
        System.out.println(str1 == str3);//true
    }




    public static void main1(String[] args) {
        String str = "hello";//第一种方法最常用
        System.out.println(str);
        String str2 = new String("abcdef");
        System.out.println(str2);
        char[] val = {'a','b','c','d','e','f'};
        String str3 = new String(val);
        System.out.println(str3);
    }
}
