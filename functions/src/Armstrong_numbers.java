import java.util.Scanner;

public class Armstrong_numbers {

    public static void Armstong(){


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is Armstrong or Not");
        int num = input.nextInt();
        int digit_sum = 0;
        int num_c = num;


        while (num>0){

            int rem = num % 10;

            rem = rem * rem *rem;
            digit_sum += rem;

            num = num / 10;
        }

        if (digit_sum == num_c){
            System.out.println("It is Armstrong number");
        }
        else {
            System.out.println("It is Not a Armstrong number");
        }
    }








    public static void main(String[] args) {


        //The basic logic of finding a Armstrong number is the sum of cube of every digit
        // of particular given number is the same number that is inputed by the user

        Armstong();


    }
}
