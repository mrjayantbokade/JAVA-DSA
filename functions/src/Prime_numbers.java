import java.util.Scanner;

public class Prime_numbers {

    public static void main(String[] args) {

        prime();
    }

    public static void prime(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();

        int count = 0;



     if (num == 1){
         System.out.println("1 is not prime nor composite number");

     }
     else {
         for (int i = 1; i<=num; i++){
             if (num % i == 0){
                 count++;
             }
         }

         if (count == 2){
             System.out.println(num+" is a prime number");
         }
         else {
             System.out.println(num+" is not a prime number");
         }
     }
     }


    }

