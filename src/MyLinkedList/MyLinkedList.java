package MyLinkedList;

//数据结构的题必须会！！一个方法至少写5遍！！每写一个题都要画图！！！
class Node{
    public int data;//0
    public Node next;//null

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {//以不带头节点的单向非循环列表演示：
    public Node head;//head是个引用 保存单链表头节点的引用
    //head 是整个单链表的头 是MyLinkedList的成员属性

    //头插法
    public void addFirst(int data){
        Node node = new Node(data);

        if(this.head == null){
            //第一次插入节点
            this.head = node;
            return;
        }
        //单链表插入的时候要先绑后面！！
        node.next = this.head;//这两行代码不可以换位置！！！
        this.head = node;//这两行代码不可以换位置！！！
    }




    //尾插法
    public void addLast(int data){
        Node node = new Node(data);

        if(this.head == null){
            //第一次插入节点
            this.head = node;
            return;
        }

        Node cur = this.head;
        while(cur.next!=null){
            cur = cur.next;
        }//跳出循环说明cur.next为空了
        cur.next = node;
    }



    //任意位置插入，第一个数据节点为0号下标
    public boolean addIndex(int index,int data) {
        if (index == 0) {

        }
        if (index == this.size()) {

        }
        //先找到 index位置的前一个节点的地址
        searchIndex(index);
        //进行插入

    }


    private Node searchIndex(int index){
        //1、对index进行合法性检查
        if(index<0||index>this.size()){
            throw new RuntimeException("index位置不合法！");
        }
        Node cur = this.head;//index-1
    }




    //查找是否包含关键字key 包含返回true 不包含返回false
    public boolean contains(int key){
       Node cur = this.head;
       while(cur!=null){
            if(cur.data==key){
                return true;
            }
            cur = cur.next;
       }
       return false;
    }




    //得到单链表的长度
    public int  size(){
        int count = 0;
        Node cur = this.head;
        while(cur!=null){
            count++;
            cur = cur.next;
        }
        return count;
    }



    //打印单链表
    public void display() {
        Node cur = this.head;
        //一般情况下不让head轻易改变，所以定义一个cur
        while(cur!=null){
            System.out.println(cur.data +" ");
            cur = cur.next;
        }
    }

}
