public class Que1 {

    public Node head;
//    private Node tail;


    
    public void mergeByKunalsWay(Que1 list1, Que1 list2){

        Node temp1 = list1.head;
        Node temp2 = list2.head;
        Que1 newList = new Que1();
        Node newNode = new Node();


        while (temp1.next != null && temp2.next != null){

            if (temp1.value < temp2.value){

               insert
            }else {
                if (head == null){
                    head = newNode;
                    newNode = temp2;
                }
                newNode.next = temp2;
                newNode = newNode.next;
                temp2 = temp2.next;
            }

        }

        if (temp1.next == null){
            newNode.next = temp1;
            newNode = newNode.next;
        }

        while (temp1.next != null){
            newNode.next = temp1;
            temp1 = temp1.next;
        }

        while (temp2.next != null){
            newNode.next = temp2;
            temp2 = temp2.next;
        }

        display();

    }
    public void mergeLinkedList(Que1 list1, Que1 list2){

        Node temp1 = list1.head;
        Node temp2 = list2.head;
        Que1 newList = new Que1();
        Node newNode = new Node();



        while (temp1.next != null && temp2.next != null){

            if (temp1.value < temp2.value){

                if (head == null){
                    head = newNode;
                    newNode = temp1;
                }
                newNode.next = temp1;
                newNode = newNode.next;
                temp1 = temp1.next;
            }else {
                if (head == null){
                    head = newNode;
                    newNode = temp2;
                }
                newNode.next = temp2;
                newNode = newNode.next;
                temp2 = temp2.next;
            }

        }

        if (temp1.next == null){
            newNode.next = temp1;
            newNode = newNode.next;
        }

        while (temp1.next != null){
            newNode.next = temp1;
            temp1 = temp1.next;
        }

        while (temp2.next != null){
            newNode.next = temp2;
            temp2 = temp2.next;
        }

        display();
    }
    public void newWay(){

        Node currentNode  = head;
        while (currentNode.next != null){
            if (currentNode.value != currentNode.next.value){
                currentNode = currentNode.next;
            }

            currentNode.next = currentNode.next.next;
        }

//        tail = currentNode;
//        tail.next = null;
    }
    public void display(){
        if (head == null){
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public void insertFirst(int value){

        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

    }


    public void insertViaRecursion( int index, int value){


        if (index == 1){
            insertFirst(value);
            return;
        }


        if (head == null){
            return;
        }

        Node temp = head;
        Node prev = getNode(index-1, temp);
        Node newNode = new Node(value);
        newNode.next = prev.next;
        prev.next = newNode;





    }


    private Node getNode(int index, Node temp) {

        if (index == 1){
            return temp;
        }
        return getNode(index-1, temp.next);
    }



    public void removeDuplicate() {
        if (head == null){
            return;
        }

        Node temp = head;
        while (temp.next.next != null){

            System.out.println(temp.value + " temp.value");
            System.out.println(temp.next.value + " temp.next.value");
           while (temp.value == temp.next.value){
               if (temp.value == temp.next.value){
                   remove(temp);
//                size--;
               }
           }
            temp = temp.next;
        }

        if (temp.value == temp.next.value){
            remove(temp);
        }
    }


    private void remove(Node temp){

        if (temp.next.next == null){
            temp.next = null;
            return;
        }

        temp.next = temp.next.next;

    }



    private class Node{

        private int value;
        private Node next;
        public Node(){

        }

        public Node(int value){
            this.value = value;
        }


        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }



}
