import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraylistt {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList< >(10);
        Scanner input = new Scanner(System.in);



        for (int i=0; i<10; i++){
            list.add(input.nextInt());

        }
        //list.set(1,23);

        System.out.println(list);
    }
}
