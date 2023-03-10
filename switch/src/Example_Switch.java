import java.util.Scanner;
public class Example_Switch {
    public static void main(String args[]){

        //in this program we'lll see how the swtich statement works
        //this is the alternative and clean way of if statement


        Scanner input = new Scanner(System.in);
        //taking input
        System.out.println("Choose the fruit among\napple\nmango\nwatermelon\n");
        String fruit = input.next();

        switch (fruit){

            case  "apple":
                System.out.println("A sweet red fruit");
                break;

            case  "mango":
                System.out.println("King of fruit");
                break;

            case "watermelon":
                System.out.println("A big juicy and red in color from inside");
                break;

            default:
                System.out.println("Enter the valid fruit");


        }


        //The better way to done with switch statements suggested by intellij idea and kunal kushwaha
        //The benefit of using this way of switch statement is, not neccesary the break statement
//        switch (fruit) {
//            case "apple" -> System.out.println("A sweet red fruit");
//            case "mango" -> System.out.println("King of fruit");
//            case "watermelon" -> System.out.println("A big juicy and red from inside");
//            default -> System.out.println("Enter the valid fruit");
//        }


        System.out.println("Enter the number of day:");
        int day = input.nextInt();

//        switch (day){
//            case 1 -> System.out.println("It's Monday");
//            case 2 -> System.out.println("It's Tuesday");
//            case 3 -> System.out.println("It's Wednesday");
//            case 4 -> System.out.println("It's Thursday");
//            case 5 -> System.out.println("It's Friday");
//            case 6 -> System.out.println("It's Saturday");
//            case 7 -> System.out.println("It's Sunday");
//            default -> System.out.println("There are seven days on our planet, you can tell me if you are from differnt planet");
//        }

        //Let's try various alternates of switch
        //Way 1
        switch (day){
            case 1 -> System.out.println("Weekday");
            case 2 -> System.out.println("Weekday");
            case 3 -> System.out.println("Weekday");
            case 4 -> System.out.println("Weekday");
            case 5 -> System.out.println("Weekday");

            case 6 -> System.out.println("Weekend");
            case 7 -> System.out.println("Weekend");
        }

        //Way 2
//        if (day == 1) {
//            System.out.println("Weekday");
//        } else if (day == 2) {
//            System.out.println("Weekday");
//        } else if (day == 3) {
//            System.out.println("Weekday");
//        } else if (day == 4) {
//            System.out.println("Weekday");
//        } else if (day == 5) {
//            System.out.println("Weekday");
//        } else if (day == 6) {
//            System.out.println("Weekend");
//        } else if (day == 7) {
//            System.out.println("Weekend");
//        }

        //Way 3
        //without the break statement
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }

        //Way 4
        //the cleaner way
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

        //how clean is this!
        //as compare to the previos way







    }
}
