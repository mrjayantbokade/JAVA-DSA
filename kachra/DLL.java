package pack;

public class DLL {


    public Node head;
    public Node tail;
    public class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;

        }




    }



    public void addbegin(int data){

        Node newnode = new Node(data);
        if (head == null){
            head = newnode;
            newnode.prev = null;
            return;
        }

        if (head != null){
            head.prev = newnode;
        }


        newnode.next = head;
        newnode.prev = null;
        head = newnode;


    }


    public void addlast(int data){
        Node newnode = new Node(data);

        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = newnode;
        newnode.prev = temp;
        newnode.next = null;
        tail = newnode;

    }

    Node last  = null;

    public void printlist(){

        Node temp = head;

        if (head == null){
            System.out.println("head is null");
            return;

        }

        while (temp != null){
            System.out.print(temp.data +" -> ");
            last = temp;

            temp = temp.next;

        }
        System.out.println("null");
        System.out.println();


    }



    public void printreverselinkedlist(){

        System.out.print("null");

        while (last != null){
            System.out.print(" -> " + last.data);
            last = last.prev;
        }

//        Node lasttemp = last;
//        while (lasttemp != null){
//
//            System.out.print(" -> "+lasttemp.data);
//            lasttemp = lasttemp.prev;
//
//        }

    }

    public void deletefirst(){

        if (head == null){
            System.out.println("list is empty and node cannot be deleted" );
            return;
        }


        head = head.next;
        head.prev = null;




    }

    public void deletelast(){




        if (head == null){
            System.out.println("list is empty node cannot be deleted");
            return;
        }



        Node temp = head;
        Node secondlast = temp.next;

        while (temp.next != null){

            temp = temp.next;

        }

        secondlast.next = null;
        tail = secondlast;





    }

    public static void main(String[] args) {


        DLL dll = new DLL();

        dll.addbegin(88);





        dll.deletelast();



        dll.printlist();






    }
}
