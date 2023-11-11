package pack;

public class Bhhood {


    public Node head;
    public Node tail;


    class Node{
        int data;
        Node next;

        Node(int data ){
            this.data = data;
            this.next = null;

        }
    }





    public void addlast(int data){

        Node newnode = new Node(data);
        Node temp = head;

        if (head == null){

            head  = newnode;
            return;
        }


        while (temp.next != null){

            temp = temp.next;

        }

        temp.next = newnode;
        tail = newnode;

        temp = newnode;
        newnode.next = null;
        tail = newnode;
    }
    public void printlist(){

        if (head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null){

            System.out.print(temp.data+" -> ");
            temp = temp.next;

        }

        System.out.println("null");
    }
    public void insertfirst(int data){

        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            head = tail;
            return;
        }

        newNode.next  = head;
        head = newNode;

    }

    public void deletelast(){

        if (head.next == null){
            head = null;
        }


        Node temp = head;
        Node lastnode = temp.next;

        while (lastnode.next != null){
            lastnode = lastnode.next;
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
    }
    public  void deletefirstnode(){
        if (head == null){
            System.out.println("List is empty ");
            System.out.println("Node cannot be deleted from an empty list");
            return;

        }

        head = head.next;



    }

    public void searchnode(int value){
        Node temp = head;
        int position = 1;

        while (temp != null){

            if (temp.data == value){
                System.out.println("Node is available in linked list at position "+position);
                return;
            }

            position++;
            temp = temp.next;
        }

        System.out.println("Node not found");

    }

    public static void main(String[] args) {
        Bhhood list = new Bhhood();

        list.insertfirst(55);
        list.insertfirst(558);
        list.insertfirst(5);

        list.addlast(88);
        list.printlist();

    }
}
