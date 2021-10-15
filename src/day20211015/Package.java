package day20211015;
//封装
class Student{
    //没有特殊的要求时，所有的属性设置为私有的 private 一定要体现封装！！
    private String MyName;//限定只能在类当中进行访问
    //如果一个属性或者方法被private修饰，那么只能在类当中使用该属性或者方法
    private int age;

    //编译器可以自动生成getMyName和 setMyName
    // 快捷键：alt+inset（F12）键
    //提供一个公开的接口
    public String getMyName(){
        return this.MyName;
    }

    public void setMyName(String name){
        MyName = name;
    }

    //如果写成这样，输出为null
//    public void setMyName(String MyName){
//        MyName = MyName;//其实就是自己给自己赋值，并没有赋值属性，局部变量优先！！
//        }

    //要想改正该代码，就使用关键字：this
    //this ：表示当前对象的引用
//    public void setMyName(String MyName){
//         this.MyName = MyName;//其实就是自己给自己赋值，并没有赋值属性，局部变量优先！！
//       }


    public void func1(){
       System.out.println("func1()");

    }

//    public void show(){
//        System.out.println("我叫"+this.MyName+"，今年"+age+"岁");//可以不加this 但是根据编程规范建议加上
//    }


    //重新实现了一下 Object类的 toString()的方法
    //Object 是所有类的父类
    @Override//注解：这个注解指的是 这个方法是重新写的
    public String toString() {
        return "Student{" +
                "MyName='" + MyName + '\'' +
                ", age=" + age +
                '}';
    }
}
//以上是类的实现者写的代码
//以下是类的调用者

public class Package {
    public static void main(String[] args) {
        Student student = new Student();
        student.setMyName("liming");
        System.out.println(student.getMyName());
        System.out.println(student);
    }
}
