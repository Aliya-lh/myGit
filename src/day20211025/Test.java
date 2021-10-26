package day20211025;//多态演示

class Shape{
    public void draw(){

    }
}

class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个⚪");
    }
}

class React extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个♢");
    }
}
public class Test {
    public static void drawShapes(){
//        int[] array = {1,2,3,46,7};
//        for(int a : array){
//
//        }

        //创建一个Shape 对象的数组
//        Shape shape2 = new Cycle();
        Shape[] shapes = {new Cycle(),new React(),new Cycle(),new React()};
        for(Shape shape:shapes){
            shape.draw();
        }

    }










    public static void drawMap(Shape shape){//参数类型为父类
        shape.draw();
    }


    public static void main(String[] args) {
        Shape shape1 = new Cycle();//向上转型
        Shape shape2 = new React();
        drawMap(shape1);
        drawMap(shape2);
//        shape1.draw();
//        shape2.draw();
    }
}
