package pack;

import java.util.Scanner;

public class Average {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the number of subjects");
        int num = in.nextInt();

        int sum = 0;

        for (int i=1; i<=num; i++){
            System.out.println("enter marks");
            int marks = in.nextInt();
            sum = sum + marks;

        }


        int avg = sum/num;
        System.out.println("average of marks "+avg);
    }

}
