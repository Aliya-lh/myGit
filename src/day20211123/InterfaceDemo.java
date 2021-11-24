package day20211123;

public class InterfaceDemo {
    public static void main(String[] args) {
        //汽车的出行方式
        Travel carTravel = new Car();//向上转型 把子类对象赋给父类引用
        // 接口不能实例化
        carTravel.setWay(" Car");//调用子类的实现方法设定出行方式
        System.out.println(carTravel.getTravelWay());//打印出行方式
        //飞机的出行方式
        Travel airplaneTravel = new Airplane();
        airplaneTravel.setWay(" Airplane");
        System.out.println(airplaneTravel.getTravelWay());
        if (carTravel instanceof Car) {//动态绑定
            Car car = (Car) carTravel;
            System.out.println(car.getTravelWay());
        }

    }
}

    interface Travel{
        //接口当中的成员变量默认为常量
        static final String TWAY = "Travel By";//不可修改
        //成员方法也必须是抽象的
         public abstract String getTravelWay();//接口里面的方法
        void setWay(String travelWay);//抽象方法  带参数的

    }

    //写一个方法实现这个接口
    class Car implements Travel{
        //旅行的方式
        //赋初值
        private String travelWay = "";//一般在类里面，成员变量用private修饰，体现封装

        @Override
        public String getTravelWay() {
            return travelWay;
        }

        @Override
        public void setWay(String subWay) {
        travelWay = TWAY+subWay;
        }

    }

    class Airplane implements Travel {
        private String travelWay = "";

        @Override
        public String getTravelWay() {
            return travelWay;
        }

        @Override
        public void setWay(String subWay) {
            travelWay = TWAY+subWay;
        }
    }

