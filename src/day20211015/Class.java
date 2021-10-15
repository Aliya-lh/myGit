package day20211015;
//在Java中如何定义一个类  如何实例化一个类
class Person{
    //字段-> 成员变量  定义在方法外边 类的里面
    //实例成员变量：对象里面
    //注意：实例成员没有初始化，默认值为对应的0值
    //即：引用类型默认为 null  简单类型默认为 0
    //特殊的：char -> '\u0000'   boolean -> false
     public String name;//此处先暂时加一个public 也可以不加
     public int age;
     public char ch;
     public boolean flg;

    //静态成员变量:    不属于对象  属于类(Person)
     public static int size ;//静态的成员变量只有一份！！

    //方法 -> 行为(一般是动词，也可以不是）
    //实例成员方法
    public void eat(){
        //public： 访问修饰限定符
        // 还有 private私有的 protected受保护的 或者什么都不写 也就是默认权限（包访问权限）
        System.out.println("eat()!");
    }
    public void sleep(){
        System.out.println("sleep()");
    }
    //静态成员方法:
    public static void func1(){
        System.out.println("static::func1()");
    }
}


public class Class {
    public static void main(String[] args) {
        Person person = new Person();
        //实例化一个对象 通过关键词 new
        //类比int a = 10;
        //如何访问对象当中的实例成员变量
        //通过对象的引用
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.ch);
        System.out.println(person.flg);//访问普通的实例成员变量
        System.out.println(Person.size);//访问静态成员变量

        person.eat();//在主函数内通过对象的引用来访问方法
        person.sleep();
        //访问静态方法
        Person.func1();
    }


}
