package Sorting;

import java.util.Arrays;

public class Bubble {


    public static void main(String[] args) {
        int arr[] = { 2, 12, 4, 2, 1,24, 2};
        for(int i=0; i<arr.length; i++){
            for (int j=1; j<arr.length; j++){
                if (arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        System.out.println(Arrays.toString(arr));
    }
}
