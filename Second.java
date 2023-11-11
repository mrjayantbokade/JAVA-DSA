package pack;

import java.util.Scanner;

public class Second {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new  int[5];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i=0; i<arr.length-1; i++){
            
            System.out.println("Enter the number at index "+ i );
             arr[i] = in.nextInt();
             sum = sum + arr[i];
             if (arr[i] < min){
                 min = arr[i];
             }
             if (arr[i] > max){
                 max = arr [i];
             }

        }
        System.out.println("Total sum is " + sum);

        System.out.println("largest number is " + max);
        System.out.println("smallest  number is " + min);
    }
}
