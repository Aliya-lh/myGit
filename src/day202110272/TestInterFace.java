package day202110272;
//接口（interface)
interface Shape{
    //int a = 10;
    public int a = 10;
//    public void func1(){//报错 不能有普通方法
//
//    }
    public abstract void draw();//接口当中的方法都是抽象方法
    default public void func(){//其实可以有具体实现的方法 一般不用这个方法
        System.out.println("hhhhh");
    }
}


interface A{

}
class Cycle implements Shape,A{
    @Override
    public void draw() {

    }
}

//演示多继承
class Animal{
    protected String name;
    public Animal(String name){
        this.name = name;
    }
}

interface IFlying{
    void fly();
}
interface IRunning{
    void run();
}
interface  ISwimming{
    void swim();
}

class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在用四条腿跑");
    }
}

class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在用尾巴游泳");
    }
}


class Frog extends Animal implements IRunning, ISwimming {
    public Frog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在往前跳");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在蹬腿游泳");
    }
}


public class TestInterFace {

}
