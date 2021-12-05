package day20211205;

import java.math.BigDecimal;
import java.util.Arrays;

public class Test {
    //输入一个整数 n ，求 1～n 这 n 个整数的十进制表示中 1 出现的次数
    //例如， 1~13 中包含 1 的数字有 1 、 10 、 11 、 12 、 13 因此共出现 6 次
    public int NumberOf1Between1AndN_Solution(int n) {
        int result = 0;
        int high = n / 10, cur = n % 10, base = 1, low = 0;
        // 从低位到高位，累加每一位为1的数的个数
        while (high != 0 || cur != 0) {
            if (cur == 0) {
                result += high * base;
            } else if (cur == 1) {
                result += high * base + low + 1;
            } else {
                result += high * base + base;
            }
            low = cur * base + low;
            cur = high % 10;
            high = high / 10;
            base = base * 10;
        }
        return result;
    }



    //数字以 0123456789101112131415... 的格式作为一个字符序列，在这个序列中第 2 位（从下标 0 开始计算）是 2 ，
    // 第 10 位是 1 ，第 13 位是 1 ，以此类题，请你输出第 n 位对应的数字。
    public int findNthDigit (int n) {
        // write code here
        if(n<10)return n;
        //把0位剔除,方便计算
        n--;
        int k=1;
        int num=0;
        //计算出n所在的区间，并保存n所在区间的位数
        while(n>0){
            num=n;
            n=(int)(n-Math.pow(10,k-1)*9*k);
            k++;
        }
        //a：第几个数，b：数的第几位
        int a=num/(k-1);
        int b=num%(k-1);
        //a需要加上区间的基数
        a=a+(int)(Math.pow(10,k-2));
        String s=a+"";
        //a的第b位数字就是所求的第n位数字
        return Integer.parseInt(s.substring(b,b+1));
    }






    //输入一个非负整数数组numbers，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
    //例如输入数组[3，32，321]，则打印出这三个数字能排成的最小数字为321323。
    //1.输出结果可能非常大，所以你需要返回一个字符串而不是整数
    //2.拼接起来的数字可能会有前导 0，最后结果不需要去掉前导 0
    public String PrintMinNumber(int [] numbers) {
        if(numbers.length == 0)return "";
        String ans = null;
        int i,j;

        Arrays.sort(numbers);
        StringBuffer temp = new StringBuffer("");
        for(j = 0; j<numbers.length;j++)temp.append(numbers[j]);
        ans = temp.toString();

        for(i = numbers.length-2; i >= 0; i--){
            if(numbers[i]<numbers[i+1]){
                j = numbers.length - 1;
                while(j>i && numbers[j]<=numbers[i])j--;
                int t = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = t;

                int x = i+1;
                int y = numbers.length-1;
                while(x<y){
                    t = numbers[x];
                    numbers[x++] = numbers[y];
                    numbers[y--] = t;
                }
                temp = new StringBuffer("");
                for(j = 0; j<numbers.length;j++)temp.append(numbers[j]);
                if(ans == null)ans = temp.toString();
                else {
                    BigDecimal a = new BigDecimal(temp.toString());
                    BigDecimal b = new BigDecimal(ans);
                    if(a.compareTo(b)<0){
                        ans = temp.toString();
                    }
                }
                i = numbers.length-1;
            }
        }
        return ans;
    }
}
