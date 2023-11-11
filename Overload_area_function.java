package pack;

import java.util.Scanner;
public class Overload_area_function {
    static void area(int base, int height) {

        int ap = base * height;

        System.out.println("The area of parallelogram is " + ap);
    }

    static void area(double d1, double d2) {
        double ar =  d1 * d2;
        System.out.println("The area of rhombus is " + ar);
    }

    static void area(double a, double b , double h) {
        double at =  (a + b)/2 * h;
        System.out.println("The area of trapexium is " + at);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("choose the operation");
        System.out.println("1. Area of parallelogram");
        System.out.println("2. Area of rhombus");
        System.out.println("3. Area of trapezium");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the base :");
                int base = in.nextInt();

                System.out.println("Enter the base :");
                int height = in.nextInt();

                area(base,height);
                break;
            case 2:
                System.out.println("Enter the diagonal 1 :");
                double d1 = in.nextDouble();

                System.out.println("Enter the diagonal 1 :");
                double d2 = in.nextDouble();

                area(d1, d2);
                break;
            case 3:
                System.out.println("Enter length of a :");
                double a = in.nextDouble();
                System.out.println("Enter length of b :");
                double b = in.nextDouble();

                System.out.println("Enter the height");
                double h = in.nextDouble();
                area(a, b, h);
                break;
        }
    }
}