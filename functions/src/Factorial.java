import java.util.Scanner;

public class Factorial {

    public static int  Fac(int n){

        if (n == 1){
            return 1;
        }
        else return n * Fac(n-1);
    }
    public static void main(String[] args) {

        System.out.print("Enter the number for finding factorial of that number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("The factorial of "+num+" is "+Fac(num));

    }
}
