package jayant;

public class CLL {


    public Node head;
    public Node tail;
    private int size;

    public void deleteNode(int value){


        if (head == null){
            return;
        }
        Node firstNode = findNode(value);
        if (firstNode == null){
            System.out.println("Node not found");
            return;
        }
        firstNode.next = firstNode.next.next;
        size--;

    }

    private Node findNode(int value) {

        Node temp = head;
        while (temp.next != head){
            if (temp.next.value == value){
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }

    public void insertAtIndex(int value, int index){

        if (index == 1){
            insertFirst(value);
            return;
        }

        if (index == size+1){
            insertLast(value);
            return;
        }

        if (index > size+2){
            System.out.println("do not insert at this index "+index);
            System.out.println("circular linked list is not of that index-1");
            return;
        }

        Node previousNode  =  getNode(index);
        Node middleNode = new Node(value);
        Node afterNode = previousNode.next;

        middleNode.next = afterNode;
        previousNode.next = middleNode;
        size++;
    }

    public Node getNode(int index){

        Node temp = head;
        for (int i = 1 ; i < index; i++) {
            temp = temp.next;

        }

        return temp;
    }

    public void insertLast(int value){
        if (head == null){
            insertFirst(value);
            return;
        }

        Node newNode = new Node(value);
        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    public void display(){
        if (head == null){
            return;
        }

        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + " - > ");
            temp  = temp.next;

        }

    }

    public void insertFirst(int value){
        Node newnode = new Node(value);

        if (head == null){
            head = newnode;
            tail = head;
            tail.next = head;
            newnode.next = tail;
            size++;
            return;
        }

        newnode.next = head;
        tail.next = newnode;
        head = newnode;
        size++;


    }




    public CLL(){
        this.size = 0;
    }


    private class Node{

        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }






    }


}
