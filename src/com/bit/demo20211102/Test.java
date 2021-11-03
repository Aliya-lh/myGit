package com.bit.demo20211102;

import java.util.Arrays;
//克隆自定义类型

 class Money implements Cloneable{
    double money = 12.5;

     @Override
     protected Object clone() throws CloneNotSupportedException {
         return super.clone();

     }
 }
class Person implements Cloneable{
    public int age;

    Money m = new Money();

    @Override//引用类型实现深拷贝
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        //1.克隆person
        Person p = (Person)super.clone();
        //2.克隆当前的Money对象
        p.m = (Money) this.m.clone();
        return p;
    }
}





public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person)person1.clone();
        System.out.println("======修改======");
        person2.m.money = 99.9;
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
    }


    public static void main2(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person)person1.clone();
        System.out.println(person1.age);
        System.out.println(person2.age);
        System.out.println("======修改======");
        person2.age = 99;
        System.out.println(person1.age);
        System.out.println(person2.age);
    }
//    public static void main1(String[] args) {
//        int[] array = {12,4,89,43,56};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//
//    }

    //class Student{
//    public String name;
//    public int age;
//    public int score;
//
//    public Student(String name, int age, int score) {
//        this.name = name;
//        this.age = age;
//        this.score = score;
//    }
//}
}
