package jayant;

import com.sun.jdi.Value;

public class Main {


    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(44);
        list.insertFirst(84);
        list.add(66);
        list.add(646);
        list.insertAtIndex(55, 1);
        list.insertAtIndex(22, 5);
        list.insertAtIndex(3, 6);
        list.insertAtIndex(123, 7);
        System.out.println(list.size);
        list.display();
        System.out.println();
        list.deleteFirst();
        list.display();
        System.out.println();
        System.out.println(list.size);
        list.deleteLast();
        System.out.println(list.size);
        list.display();




    }
}
