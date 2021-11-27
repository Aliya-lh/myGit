package MyLinkedList;


class Node{
    public int data;//0
    public Node next;//null

    public Node(int data){
    this.data = data;
    this.next = null;//可以不写 默认为空
    }

}
public class MyLinkedList {
    public Node head;//保存单链表头节点的引用

    //头插法
    public void addFirst(int data){
        Node node = new Node(data);

        if(this.head == null){
            //第一次插入节点
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }
    //尾插法
    public void addLast(int data){

    }
    //任意位置插入，第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        return false;
    }
    //查找是否包含关键字key是否在单链表中
    public boolean contains(int key){
        return false;
    }

}
