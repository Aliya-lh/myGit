package day20211206;
//实验四
import java.util.Random;
import java.util.Scanner;

public class TestDemo {
    public static void main2(String[] args) {
        //String类常用方法实验
        String s = "This is a demo of the JAVA";
        System.out.println("字符串的长度："+s.length());
        System.out.println("字符串里第8个位置的字符是：" +s.charAt(8));
        System.out.println("第8个字符后面的子字符串是："+s.substring(8));
        System.out.println("8到15之间的字符串是："+s.substring(8,15));
        System.out.println("测试字符串是否以He开头："+s.startsWith("He"));
        System.out.println("将字符串全部转换为小写字符："+s.toLowerCase());
        System.out.println("h第一次出现的位置是"+s.indexOf('h'));
        System.out.println("h最后一次出现的位置是："+s.lastIndexOf('h'));
    }


    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = "HELLO";
        String s5 = ",Good-bye";
        System.out.println("s1.equals(s2):"+s1.equals(s2));
        System.out.println("s1==s2:"+(s1==s2));
        System.out.println("s1==s3:"+(s1==s3));
        System.out.println("s1.equals(s4)"+s1.equals(s4));
        System.out.println("s1.equalsIgnoreCase(s4):"+s1.equalsIgnoreCase(s4));
        System.out.println("s1.concat(s5)"+s1.concat(s5));


    }

    public static void main1(String[] args) {
        //猜数字游戏
        Random random = new Random();//默认随机种子是系统时间
        Scanner sc = new Scanner(System.in);
        int toGuess = random.nextInt(100);
        while(true){
            System.out.println("请输入要输入的数字：（1-100）");
            int num = sc.nextInt();
            if(num<toGuess){
                System.out.println("低了");
            }else if(num>toGuess){
                System.out.println("高了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
        sc.close();
    }


}

