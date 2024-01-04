package jayant;

import com.sun.jdi.Value;

public class Main {


    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(44);
        list.insertFirst(44);
        list.add(66);
        System.out.println(list.size);
        list.display();


    }
}
