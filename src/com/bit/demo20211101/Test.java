package com.bit.demo20211101;
//类和对象（补充）
//对象初始化
//    public class Test {
//        public static void main1(String[] args) {
//            int a = 0;//在Java方法内部定义一个局部变量时，必须要初始化，否则会编译失败
//            System.out.println(a);
//
//        }
//
//        //如果是对象：
////    public static void main(String[] args) {
////        Date d = new Date();
////        d.printDate();
////        d.setDate(2021,6,9);
////        d.printDate();
////    }
//        //构造方法
////    构造方法(也称为构造器)是一个特殊的成员方法，名字必须与类名相同，在创建对象时，由编译器自动调用，并且
////    在整个对象的声明周期内只调用一次。
//
//        public class Date {
//            public int year;
//            public int month;
//            public int day;
//
//            // 构造方法：
//            //构造方法的作用: 对对象中的成员进行初始化，并不负责给对象开辟空间。
//            // 名字与类名相同，没有返回值类型，设置为void也不行
//            // 一般情况下使用public修饰
//            // 在创建对象时由编译器自动调用，并且在对象的声明周期内只调用一次
//            public Date(int year, int month, int day) {
//                this.year = year;
//                this.month = month;
//                this.day = day;
//                System.out.println("Date(int,int,int)方法被调用了");
//            }
//
//            public void printDate() {
//                System.out.println(year + "-" + month + "-" + day);
//            }
//
////        public static void main(String[] args) {
////            // 此处创建了一个Date类型的对象，并没有显式调用构造方法
////            Date d = new Date(2021, 6, 9); // 输出Date(int,int,int)方法被调用了
////            d.printDate();
////        }
//            //构造方法特性：
//// 1. 名字必须与类名相同
////2. 没有返回值类型，设置为void也不行
////3. 创建对象时由编译器自动调用，并且在对象的生命周期内只调用一次(相当于人的出生，每个人只能出生一次)
////4. 构造方法可以重载(用户根据自己的需求提供不同参数的构造方法
//        }
//
class B {
    public int Func() {
        System.out.print("B");
        return 0;
    }
}
class D extends B {//D 继承 B
    @Override
    public int Func() {
        System.out.print("D");
        return 0;
    }
}
public class Test {
    public static void main(String[] args) {
        B a = new B();
        B b = new D();
        a.Func();
        b.Func();
    }
}


   // }

