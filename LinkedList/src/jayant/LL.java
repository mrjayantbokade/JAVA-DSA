package jayant;

public class LL {

    public Node head;
    public Node tail;
    public int size;
    public LL(){
        this.size = 0;
    }


    public void display(){
        Node temp = head;

        System.out.print("head:");
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;

        }

        System.out.print(tail.next);


    }
    public void add(int value){
        Node newnode = new Node(value);
//        if (head == null){
//            head = newnode;
//            tail = head;
//            size += 1;
//        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;

        }
        temp.next = newnode;
        tail = newnode;
//        newnode.next = null;
        size += 1;
    }
    public  void insertFirst(int value){

        Node newnode = new Node(value);
        newnode.next = head;
        head = newnode;
        if (tail == null){
            tail = head;
        }

        size += 1;
        System.out.println("node inserted");


    }

    private class Node{

        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }




}