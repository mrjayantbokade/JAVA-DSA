import java.util.Scanner;

public class Sub {
    public static void main(String[] args) {

        //This program is from leetcode
        //return the difference of the product and sum of a inputed number from a user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        System.out.println(Su(n));
    }


    public static int Su(int num){

        int diff =  0;
        int product = 1;
        int sum = 0;
        while (num>0){

            int rem = num % 10;
            num = num / 10;
            sum = sum + rem;
            product = product * rem;
        }

        diff = diff + (product - sum);

        return diff;
    }


}
