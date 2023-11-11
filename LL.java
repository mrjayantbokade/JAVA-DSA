package pack;

public class LL {



    private Node head;
    private Node tail;
    private int size;

    LL(){
        this.size = 0;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
        Node(int data, Node next){
            this.next = next;
            this.data = data;
        }
    }



    public void display(){

        Node temp = head;

        while (temp != null){
            System.out.println(temp.data+"->");
            temp = temp.next;
        }

    }


    public void insertatfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            head = tail;
        }

        size += 1;

    }

    public static void main(String[] args) {

    }
}
