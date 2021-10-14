package day20211012;
import java.util.Scanner;
public class Test {

//    public String replaceSpace (String s) {
//        //    请实现一个函数，将一个字符串s中的每个空格替换成“%20”。
////    例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
////
////    数据范围:
////            0<=len(s)<=1000。保证字符串中的字符为大写英文字母、小写英文字母和空格中的一种。
//        StringBuilder ans = new StringBuilder();
//        for(int i = 0;i<s.length();i++){
//            if(s.charAt(i)==' '){
//                ans.append("%20");
//            }else{
//                ans.append(s.charAt(i));
//            }
//        }
//        return ans.toString();
//    }




    public int Fibonacci(int n){
        if(n<2){
            return n;
        }return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int ret = scan.nextInt();
        System.out.println();
    }




    public int jumpFloor(int target) {
        if(target<=3){
            return target;
        }return jumpFloor(target-1)+jumpFloor(target-2);
    }









    public int jumpFloorII(int target) {
        if(target<2){
            return 1;
        }
        int sum = 0;
        for(int i=1;i<=target;i++){
            sum+=jumpFloorII(target-i);
        }
        return sum;
    }





}
