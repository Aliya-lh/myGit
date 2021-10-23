package day20211023;
//多态

class Animal{
    //    protected String name;
    public String name;
    public Animal(String name){//假设此时在Animal中提供一个构造方法，代码报错
        this.name = name;
        System.out.println("Animal(String)");
    }
    public void eat() {
        System.out.println(this.name+"Animal::sleep()");
    }
    public void sleep(){

        System.out.println("Animal::sleep()");//以上所有的全部被继承
    }
}

class Cat extends Animal {
    public int count = 99;
    public Cat(String name){
        super(name);//显示调用父类的构造方法
        //在构造Cat子类时，首先去调用父类的构造方法
        System.out.println("Cat(String)");
    }
//    public String name;
//    public void eat(){
//
//        System.out.println("Cat::eat()");
//    }//以上代码无需再写  子类已经继承了父类的属性


    //重写 override
    public void eat() {
        System.out.println(this.name+"我的Animal::sleep()");
    }
}

public class TestDemo1 {
    public static Animal func(){//返回值是Animal  向上转型
//        Cat cat = new Cat("咪咪");
        return new Cat("咪咪");
    }

    public static void main(String[] args) {
        Animal animal = func();
        animal.eat();
    }






//    public static void func(Animal animal){
//        animal.eat();//传参
//    }
//    public static void main(String[] args) {
//        Cat cat = new Cat("咪咪");
//        func(cat);
//    }//在这个过程就发生了向上转型




    public static void main2(String[] args) {
        //向上转型  ：父类引用 引用子类对象
        Animal animal = new Cat("咪咪");
        animal.eat();
//        animal.count;//报错error 通过向上转型之后，通过父类的引用只能访问父类自己的方法或者属性。
        //父类引用只能访问自己特有的。
    }

    public static void main1(String[] args) {
        Animal animal = new Animal("豆豆");
        Cat cat = new Cat("咪咪");
    }
}
