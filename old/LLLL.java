package pack;






public class LLLL {

    Node head;
    Node tail;

    class  Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }



    public  void insertfirst(int data){

        Node newnode = new Node(data);

       newnode.next = head;
       head = newnode;
    }

public void last(int data){
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        Node newnode =  new Node(data);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = newnode;
        tail = newnode;
}


    public void display(){

        if (head == null){
            System.out.println("list is empty");
            return;
        }

        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;

        }
        System.out.print("null");

    }


    public static void main(String[] args) {


        LLLL list = new LLLL();

        list.insertfirst(88);
        list.insertfirst(77);
        list.insertfirst(633);
        list.insertfirst(10);
        list.last(9099);
        list.last(9099);
        list.last(9099);
        list.last(9099);
        list.display();

    }

}
