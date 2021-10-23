package day20211021;

class Bass{
    public int a;
}

class Derive extends Bass{
    public int b;//派生类中除了有 b 以外，还有父类的 a
}
public class TestDemo {
    public static void main(String[] args) {
        Derive derive = new Derive();
        derive.a = 99;
    }
}
