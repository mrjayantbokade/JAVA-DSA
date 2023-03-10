import java.sql.SQLOutput;
import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year of Engineering");
        int Engineering_year = input.nextInt();
        System.out.println("Enter the department");
        String Department = input.next();
        System.out.println("//////////////////////////////////////////////////////////////");

//        switch (Engineering_year) {
//            case 1:
//                System.out.println("First Year Engineering");
//                break;
//            case 2:
//                System.out.println("Second year Engineering");
//                switch (Department) {
//                    case "IT":
//                        System.out.println("Information Technology");
//                        break;
//
//                    case "COMPUTER":
//                        System.out.println("Computer Technology");
//                        break;
//
//                    case "MECHANICAL":
//                        System.out.println("Mechanical");
//                        break;
//
//                    case "ROBOTICS":
//                        System.out.println("Robotics");
//                        break;
//
//                    case "CIVIL":
//                        System.out.println("Civil");
//                        break;
//                }
//                break;
//            case 3:
//                System.out.println("Third year Engineering");
//                switch (Department) {
//                    case "IT":
//                        System.out.println("Information Technology");
//                        break;
//
//                    case "COMPUTER":
//                        System.out.println("Computer Technology");
//                        break;
//
//                    case "MECHANICAL":
//                        System.out.println("Mechanical");
//                        break;
//
//                    case "ROBOTICS":
//                        System.out.println("Robotics");
//                        break;
//
//                    case "CIVIL":
//                        System.out.println("Civil");
//                        break;
//                }
//                break;
//            case 4:
//                System.out.println("Final year Engineering");
//                switch (Department) {
//                    case "IT":
//                        System.out.println("Information Technology");
//                        break;
//
//                    case "COMPUTER":
//                        System.out.println("Computer Technology");
//                        break;
//
//                    case "MECHANICAL":
//                        System.out.println("Mechanical");
//                        break;
//
//                    case "ROBOTICS":
//                        System.out.println("Robotics");
//                        break;
//
//                    case "CIVIL":
//                        System.out.println("Civil");
//                        break;
//                }
//                break;
//        }


        //Better way of code with switch statements
        switch (Engineering_year) {
            case 1 -> System.out.println("First Year Engineering");
            case 2 -> {
                System.out.println("Second year Engineering");
                switch (Department) {
                    case "IT" -> System.out.println("Information Technology");
                    case "COMPUTER" -> System.out.println("Computer Technology");
                    case "MECHANICAL" -> System.out.println("Mechanical");
                    case "ROBOTICS" -> System.out.println("Robotics");
                    case "CIVIL" -> System.out.println("Civil");
                }
            }
            case 3 -> {
                System.out.println("Third year Engineering");
                switch (Department) {
                    case "IT" -> System.out.println("Information Technology");
                    case "COMPUTER" -> System.out.println("Computer Technology");
                    case "MECHANICAL" -> System.out.println("Mechanical");
                    case "ROBOTICS" -> System.out.println("Robotics");
                    case "CIVIL" -> System.out.println("Civil");
                }
            }
            case 4 -> {
                System.out.println("Final year Engineering");
                switch (Department) {
                    case "IT" -> System.out.println("Information Technology");
                    case "COMPUTER" -> System.out.println("Computer Technology");
                    case "MECHANICAL" -> System.out.println("Mechanical");
                    case "ROBOTICS" -> System.out.println("Robotics");
                    case "CIVIL" -> System.out.println("Civil");
                }
            }
        }


    }
}
