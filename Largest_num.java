import java.util.Scanner;

public class Largest_num {
    public static void main(String[] args) {


        //self


        System.out.println("print the largest number among the three numbers that are input by the user using scanner class");


        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a > b && b > c){
            System.out.println(a+" is the largest number.");
        }
        else if (b>a && b>c){
            System.out.println(b+" is the largest number");
            }
        else if (c>a && c>b){
            System.out.println(c+" is the largest number");
        }


    }
}
