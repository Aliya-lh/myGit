package MyLinkedList;

public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);
        myLinkedList.display();//头插法 打印出来数字是逆序的
        System.out.println(myLinkedList.size());
//        System.out.println("=================");
//        myLinkedList.addLast(77);
//        myLinkedList.addLast(78);
//        myLinkedList.addLast(79);
//        myLinkedList.addLast(80);
//        myLinkedList.display();//尾插法 打印出来数字是正序的



    }
}
