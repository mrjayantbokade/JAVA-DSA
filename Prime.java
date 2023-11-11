package pack;
import java.util.*;

public class Prime {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count  = 0;



           System.out.println("Enter the number: ");
           int num = in.nextInt();

           for (int i=2; i<num; i++){
               if (num % i == 0){
                   count = count + 1;
               }
           }

           if (count == 0){
               System.out.println("prime");
           }
           else {
               System.out.println("not prime");
           }


           System.out.println(count);


    }
}
