package Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void quicksort(int[] arr, int low, int high){

        if (low > high){
            return ;
        }

        int s = low;
        int e = high;
        int m = s + (e-s) / 2;
        int pivot = arr[m];

        while (s <= e){

            while (arr[s] < pivot){
                s++;
            }

            while (arr[e] > pivot){
                e--;
            }

            if (s <= e){

                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;



            }


        }


        quicksort(arr, low, e);
        quicksort(arr, s, high);



    }


    public static void main(String[] args) {
        int[] arr = {2, 1,2, 4, 222, 4,2,  2,3 ,3, 2, 2,34 ,32 -8888};
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
