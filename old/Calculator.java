import java.util.Scanner;

public class Calculator {



    //test
    public static void main(String[] args) {
        System.out.println("_______________________SIMPLE CALCULATOR_____________________ ");

        Scanner input = new Scanner(System.in);
        int ans  = 0;//


        while (true){

            //input the number for the operation
            System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulo\n0.Exit");


            int operation = input.nextInt();

            //instead you could use this also as a alternative, by going with character i am keeping the code simple here!
            //char op = input.next().charAt(0);
            //char op = input.next().trim().charAt(0);


            if (operation == 1 || operation == 2 || operation == 3|| operation == 4|| operation == 5){

                //inupt first number
                System.out.print("Enter the value of first number:");
                int num1 = input.nextInt();

                //input second number
                System.out.print("Enter the value of first number:");
                int num2 = input.nextInt();


                //for addtion
                if (operation == 1 ){
                    System.out.println("You choosed Addition");
                    ans  = num1 + num2;
                }

                //for subtraction
                if (operation == 2 ){
                    System.out.println("You choosed Subtraction");

                    ans  = num1 - num2;
                }

                //for multiplication
                if (operation == 3 ){
                    System.out.println("You choosed Multiplication");

                    ans  = num1 * num2;
                }

                //for division
                if (operation == 4){
                    if (num2 !=0){
                        System.out.println("You choosed Division");

                        ans  = num1 / num2;
                    }
                }

                //for modulo
                if (operation == 5 ){
                    System.out.println("You choosed Modulo/remainder finding");

                    ans  = num1 % num2;
                }

                //printing result of any performed operation
                System.out.println("The result of operation is "+ ans);
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }


            //breaking from infinite loop as per users request
            else if (operation == 0) {

                System.out.println("Thank you for using this Calculator! comeback again...");
                break;

            }

            //for anything that has invalid operator
            else {
                System.out.println("Invalid operation");


            }

        }

    }
}
