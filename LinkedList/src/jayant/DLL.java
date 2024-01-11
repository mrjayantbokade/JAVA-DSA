package jayant;

public class DLL {

    private Node head;
    private Node tail;
    public int size;

    public DLL(){
        this.size = 0;
    }


    public class Node{
        private int value;
        private Node previous;
        private Node next;

        Node(int value){
            this.value = value;
        }
        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
        Node(int value, Node previous, Node next){
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }


    public void insertFirst(int value){

        Node newnode = new Node(value);

        if (head == null){
            newnode.next = head;
            newnode.previous = null;
            head = newnode;
            tail = head;
            size++;
//            System.out.println(size);
            return;
        }

        newnode.next = head;
        newnode.previous = null;
        head.previous = newnode;
        head = newnode;

//        head.previous = newnode;
//        newnode.next = newnode;
//        newnode.previous = null;
//        head = newnode;
        size++;
//        System.out.println(size);
    }

    public void display(){

        if (size == 1){
            System.out.print(head.value);
            System.out.print(" --> "+ head.next );

        }


        Node temp = head;
        System.out.print(head.previous);
        while (temp.next != null){
            System.out.print(" <--> "+ temp.value);
            temp = temp.next;
        }

        System.out.print(" <--> "+temp.value);
        System.out.print(" --> "+ temp.next);
        System.out.println();

    }

    public void reverse() {

        if (size == 1){
            display();
        }

        Node temp = tail;
        System.out.print(tail.next);
        while (temp.previous != null){
            System.out.print(" <--> "+ temp.value);
            temp = temp.previous;
        }

        System.out.print(" <--> "+temp.value);
        System.out.print(" --> "+ temp.previous);
        System.out.println();


    }

    public  void add(int value){
        if (head == null){
            insertFirst(value);
            return;
        }
        Node newnode = new Node(value);
        Node lastnode = head;
        while (lastnode.next != null){
            lastnode = lastnode.next;
        }

        lastnode.next = newnode;
        newnode.previous = lastnode;
        newnode.next = null;
        tail = newnode;
        size++;
    }


    public void insertAtIndex(int value, int index){
        if (index > size+1){
            System.out.println("cannot put at index "+index);
            System.out.println("Index out of size of linked list");
            return;
        }
//
        if (index == 1){
            insertFirst(value);
            return;
        }

        if (index == size+1){
            add(value);
            return;
        }

        Node firstNode = findNode(index-1);
        Node middleNode = new Node(value);
        Node afterNode = firstNode.next;




        middleNode.next = afterNode;
        afterNode.previous = middleNode;
        middleNode.previous = firstNode;
        firstNode.next = middleNode;
        size++;



    }
    public Node findNode(int index){
        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;

        }
        return temp;

    }
}
