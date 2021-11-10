package WolfDog;

//方法的调用及返回值
public class Wolfdog2 {
    String name;
    int age;
    String color;

    //无参构造函数
    public Wolfdog2(){

    }

    //无参数返回的方法
    public void bark(){

    }

    //有参数的返回值的方法
    public String barkReturn(String name){
        System.out.println("Wolfdog bark.Named "+name);
        return name;
    }

    public static void main(String[] args) {
        Wolfdog2 dog = new Wolfdog2();//定义并初始化数据
        dog.bark();//调用无参数无返回值的方法
        String name1 = "honey";//定义传入参数值
        String name2 =dog.barkReturn(name1);//使用String接受有返回值的方法
        System.out.println(name2);//打印输出返回值
    }
}
