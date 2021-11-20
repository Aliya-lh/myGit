package day20211118;

import java.util.Random;
import java.util.Scanner;

public class Test {
    //面向对象  打印图形
    public class Shape {
        //形状类
        public void draw() {
            //无意义代码
            //在子类中要重写draw()方法
            System.out.println("图形形状");
        }

        public void clear() {
            System.out.println("\n\n\n");
        }
    }


    class Circle extends Shape {
        //圆形类
        @Override
        public void draw() {
            System.out.println("打印一个圆形 O");
        }
    }



    class Square extends Shape {
        //方形类
        @Override
        public void draw() {
            System.out.println("打印一个方形 口");
        }
    }


    class Line extends Shape {
        //直线类
        @Override
        public void draw() {
            System.out.println("打印一条直线 ————");
        }

        public void length() {
            System.out.println("一米多。。。");
        }
    }


}


