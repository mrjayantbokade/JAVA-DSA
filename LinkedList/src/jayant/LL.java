package jayant;
import java.util.*;

public class LL {

    public Node head;
    public Node tail;
    public int size;
    public LL(){
        this.size = 0;
    }



    public void deleteLast(){

        Node temp = head;
        for (int i = 1; i < size-1; i++) {

            temp = temp.next;
            System.out.println(temp.value);

        }
        temp.next = null;
        size--;

    }
    public void deleteFirst(){

        Node temp = head.next;
        head = temp;
        size--;

    }
    public void insertAtIndex  (int value, int index)  {


        if (index > size+1){
            System.out.println("Cannot place at this index");
            System.out.println("Because it is not of that length");
        }


        if (index == size){
            add(value);
        }

        if (index == 1){
            insertFirst(value);
        }else {
            Node newnode  = new Node(value);
            Node temp = head;
            for (int i = 2; i < index ; i++) {
                temp = temp.next;
            }
            Node currentNode = temp.next;
            temp.next = newnode;
            newnode.next = currentNode;
            size++;
            System.out.println("node inserted");
        }







    }

    public void display(){
        Node temp = head; //temp node

        System.out.print("head:");
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;

        }

        System.out.print(tail.next);
        System.out.println();


    }
    public void add(int value){
        Node newnode = new Node(value);
        if (tail == null){
            insertFirst(value);
        }else {

            tail.next = newnode;
            tail = newnode;
            size++;
            System.out.println("node inserted ");

            //this approach is being helpful when there is no extra object called tail and this needs
            //O(n) time complexity also
//            Node temp = head;
//            while (temp.next != null){
//                temp = temp.next;
//
//            }
//            temp.next = newnode;
//            tail = newnode;
////        newnode.next = null;
//            size += 1;
        }



    }
    public  void insertFirst(int value){

        Node newnode = new Node(value);
        newnode.next = head;
        head = newnode;
        if (tail == null){
            tail = head;
        }

        size += 1;
        System.out.println("node inserted ");


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