package day20211021;

class Animal{
//    protected String name;
    public String name;
    public Animal(String name){//假设此时在Animal中提供一个构造方法，代码报错
        this.name = name;
        System.out.println("Animal(String)");
    }
    public void eat(){
        System.out.println(this.name+"Animal::sleep()");
    }
    public void sleep(){

        System.out.println("Animal::sleep()");//以上所有的全部被继承
    }
}

class Cat extends Animal{
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
}

class Bird{
    public String name;
    public void eat(){
        System.out.println("Bird::eat()");
    }
    public void fly(){

        System.out.println("Bird::fly()");
    }
}



public class Inheritance {
    public static void main(String[] args) {
        Cat cat = new Cat("mimi");
        //cat.name = "mimi";
        cat.eat();
        cat.sleep();
    }
}
