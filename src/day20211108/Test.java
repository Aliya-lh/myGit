package day20211108;

class Computer {
    //一般情况下，成员属性设置为private，成员方法设置为public
    private String cpu; // cpu
    private String memory; // 内存
    public String screen; // 屏幕
    String brand; // 品牌---->default属性  默认包访问权限 只能在本包中被访问

    //有参数的构造方法  在初始时要给定参数
    public Computer(String brand, String cpu, String memory, String screen) {
        this.brand = brand;
        this.cpu = cpu;
        this.memory = memory;
        this.screen = screen;
    }

    //getter和setter方法的作用：主要起到封装的作用，不允许直接对属性进行操作
    //被设置和存取的属性一般是私有的  set()和get()不一定同时存在，看程序需求
    //取得属性值
    public String getCpu() {
        return cpu;
    }

    //给属性赋值
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //类方法
    public void Boot() {
        System.out.println("开机~~~");
    }

    public void PowerOff() {
        System.out.println("关机~~~");
    }

    public void SurfInternet() {
        System.out.println("上网~~~");
    }

}




public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("HW","i7","8G","13*14");//实例化一个对象并且传入参数
        System.out.println(computer.brand);//被default修饰
        System.out.println(computer.screen);//被public修饰 可以在任意类中被访问
        //System.out.println(computer.cpu);//被private修饰 封装  只能在compter类中访问，不能被其他类访问

    }
}
