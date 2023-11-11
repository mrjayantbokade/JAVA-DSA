package pack;

import java.util.Arrays;
import java.util.*;

public class INsertion {
    public static void main(String[] args) {

        //input array elements
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the array elements:");
        for (int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }

        //sorting block
        for (int j=1; j<arr.length; j++){
            int key = arr[j];
            int i = j - 1;
            while (i>=0 && arr[i]>key){
                arr[i+1] = arr[i];
                i = i - 1;
            }
            arr[i+1] = key;
        }

        //printing sorted array
        System.out.println("Sorted array");
        for(int num : arr){
            System.out.print(num + ",");
        }

    }
}
