package WolfDog;
//类的使用
//定义狼狗类
public class Wolfdog1 {
    //狼狗的姓名
    String name;
    //狼狗的年龄
    int age;
    //狼狗毛的颜色
    String color;

    //类方法 狼狗叫
    public void bark(){
        System.out.println("Wolfdog named"+name+"dress"+color+"is bark at age"+age+".");
    }

    public static void main(String[] args) {
       Wolfdog1 honeyDog = new Wolfdog1();//声明及初始化一个变量
        honeyDog.bark();//狼狗叫 方法调用

    }

}
