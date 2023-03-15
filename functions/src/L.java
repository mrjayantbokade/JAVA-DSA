import java.util.Scanner;

public class L {



    public static void is_prime(int num){


        //This function helps to find out the prime numbers up to particular range



        int count = 0;



        if (num == 1){
            //System.out.println("1 is not prime nor composite number");

        }
        else {
            for (int i = 1; i<=num; i++){
                if (num % i == 0){
                    count++;
                }
            }

            if (count == 2){
                System.out.print(num+",");
            }

        }
    }
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the value of range upto which you want to find prime numbers:");

        int n = input.nextInt();
        int i = 1;

        while (i<=n){


            is_prime(i);
            i++;
        }



    }
}
