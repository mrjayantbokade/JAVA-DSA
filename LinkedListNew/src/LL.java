public class LL {


    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        Node(int value, Node next){
            this.next = next;
            this.value = value;
        }
    }



    public static void main(String[] args) {

        LL list1 = new LL();
        LL list2 = new LL();


        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(3);
        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(5);

        list1.display();
        list2.display();



    }


    public void removeDuplicates(){

        Node temp = head;

        while (temp.next != null){

//            System.out.println("hello");
            if (temp.value == temp.next.value){
                temp.next = temp.next.next;
                size--;
            }else{

                temp = temp.next;
            }

        }
    }

    public void deleteNthNode(int position){

        if (position == 1){
            deleteFirst();
            return;
        }
        Node temp = head;
        int counter = 1;

        while (counter != position-1){
            temp = temp.next;
            counter++;
        }


        if (temp.next.next != null){
            temp.next = temp.next.next;
            size--;
            return;
        }

        temp.next = null;
        size--;

    }


    public void insertFirst(int value){

        Node newNode = new Node(value);
        
        if (head == null){
            head = newNode;
            tail = head;
            size++;
            return;
        }

        
        newNode.next = head;
        head = newNode;
        size++;
    }

    
    public void display(){
        Node temp = head;
//        System.out.println(temp.value);
        System.out.println("hello");
        while (temp!= null){
            System.out.print(temp.value);
            System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("SIZE fo Ll is: " + size );
    }



    public void insertLast(int value){

        Node newnode = new Node(value);

        if (head == null){

            head = newnode;
            size++;
            tail = head;
            return;

        }

        Node temp = head;
        while (temp.next != null){

            temp = temp.next;

        }

        temp.next = newnode;
        size++;
    }


    public void deleteFirst(){
        if (head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        head = temp.next;
        size--;
    }

    public void deleteLast(){

        if (head == null){
            System.out.println("LL is empty");
            return;
        }

        Node first = head;
//        Node second = first.next;

        while (first.next.next != null){
            first = first.next;
        }

        first.next = null;
        size--;

    }
}
