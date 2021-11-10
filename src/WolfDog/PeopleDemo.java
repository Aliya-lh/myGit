package WolfDog;
//对象的属性封装

    //定义一个People类
    class People{
        private String name;//姓名
        private int age;//年龄
        public int num;//编号

        //根据姓名、年龄和编号初始化对象
        public People(String name,int age,int num){
            this.name = name;//this.name表示的是本类的属性 name，等号右边的表示构造方法传入的参数
            this.age = age;
            this.num = num;
        }

        //获取姓名
        public String getName(){
            return name;
        }

        //设置姓名
        public void setName(String name){
            this.name = name;
        }

        //获取年龄
        public int getAge(){
            return age;
        }

        //设置年龄
        public void setAge(int age){
            this.age = age;
        }

        //获取编号
        public int getNum(){
            return num;
        }



        //设置编号
        public void setNum(int num){
            this.num = num;
        }


    }
public class PeopleDemo {
    public static void main(String[] args) {
        People person = new People("张三",15,100);//格式化一个人，名叫张三，15岁
        System.out.println(person.toString());//格式化输出person的信息
        //person.age = 50;//编译报错
        person.num = 200;//修改公共属性
    }
}
