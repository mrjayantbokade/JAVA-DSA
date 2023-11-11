package pack;

public class CLL {
    Node head;
    Node tail;

    public CLL() {
        this.head = null;
        this.tail= null;
    }


    class Node{

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void insertatlast(int data){
        Node newnode = new Node(data);

        if (head == null){

            head = newnode;
            tail = head;
            newnode.next = newnode;
            return;
        }

        tail.next = newnode;
        newnode.next = head;
        tail = newnode;

    }


    public void printlist(){

        if (head == null){
            System.out.println("list is empty");
        }

        Node temp = head;
//        while (temp.next != head){
//            System.out.println(temp.data+" -> ");
//        }
//        System.out.println("head");


        if (head != null){
            do {
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }while (temp.next != head);
        }
        System.out.print("head");
        System.out.println();
    }


    public void deletelast(){

        Node temp = head;

        if (head == null){
            System.out.println("list is empty");
            return;
        }

        while (temp.next != tail){
            temp = temp.next;
        }
        temp.next = head;
        tail = temp;


    }
    public void deletenode(int value){

        Node temp = head;
        Node prev = temp.next;

        if (head == null){
            System.out.println("list is empty");
            return;
        }

        if (head.data == value){
            tail.next = head.next;
            head = head.next;
        }
//        while (prev.next != tail){
//            if (.data == data)
//            temp = temp.next;
//        }
//        temp.next = head;
//        tail = temp;


    }



    public static void main(String[] args) {
        CLL list = new CLL();

        list.insertatlast(99);
        list.insertatlast(88);
        list.insertatlast(9955);
        list.insertatlast(77);
        list.insertatlast(66);
        list.insertatlast(55);
        list.insertatlast(44);
        list.insertatlast(11);
        list.printlist();
        list.deletelast();
        list.printlist();
        list.deletenode(99);

    }

}
