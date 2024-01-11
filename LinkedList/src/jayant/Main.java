package jayant;

import com.sun.jdi.Value;

public class Main {


    public static void main(String[] args) {
//        LL list = new LL();
//
//        list.insertFirst(44);
//        list.insertFirst(84);
//        list.add(66);
//        list.add(646);
//        list.insertAtIndex(55, 1);
//        list.insertAtIndex(22, 5);
//        list.insertAtIndex(3, 6);
//        list.insertAtIndex(123, 7);
//        System.out.println(list.size);
//        list.display();
//        System.out.println();
//        list.deleteFirst();
//        list.display();
//        System.out.println();
//        System.out.println(list.size);
////        list.deleteLast();
//        list.deleteLastKunal();
//        System.out.println(list.size);
//        list.display();
//        list.deleteAtIndex(6);
////        list.deleteAtIndex(15);
//        list.display();
//        System.out.println(list.size);
//        System.out.println(list.findNode(3));
//
////        list.deleteAtIndex(15);
//
//
//        list.insertAtIndex(123, 20);
//        list.display();
//        list.insertViaRecursion(9, 99);
//
//        list.display();

//        DLL dlist = new DLL();
////        dlist.insertFirst(55);
////        dlist.insertFirst(45);
////        dlist.insertFirst(35);
////        dlist.insertFirst(25);
////        dlist.insertFirst(15);
//        dlist.add(77);
//        dlist.add(3);
//        dlist.add(345);
//        dlist.insertAtIndex(45, 1);
//        dlist.insertAtIndex(87, 2);
//        dlist.insertAtIndex(9959045, 3);
//        dlist.insertAtIndex(45443333, 4);
//        dlist.insertAtIndex(45443333, 8);
//        dlist.insertAtIndex(45443333, 10);
//        dlist.display();
//        dlist.display();
//        dlist.reverse();



//        CLL list = new CLL();
//
//        list.insertFirst(66);
//        list.insertFirst(55);
//        list.insertFirst(44);
//        list.insertFirst(33);
//        list.insertFirst(22);
//        list.insertFirst(2211);
//        list.insertLast(98);
//        list.insertAtIndex(78, 5);
//        list.deleteNode(7);    //works very well that's it for video see you in next one
//        list.display();



        LL list = new LL();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.display();

        list.createCycle();
//        list.display();

        list.checkCycle();
    }
}
