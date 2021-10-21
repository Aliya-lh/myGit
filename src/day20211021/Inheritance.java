package day20211021;

class Animal{
    public String name;
    public void eat(){
        System.out.println(this.name+"Animal::sleep()");
    }

    public void sleep(){
        System.out.println("Animal::sleep()");
    }
}

class Cat extends Animal{
    public String name;
    public void eat(){
        System.out.println("Cat::eat()");
    }
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
        Cat cat = new Cat();
    }
}
