package Sorting;

import java.util.Arrays;

public class Test {


    public static void selectionsort(int[] arr, int row, int col, int lastindex){

        if (row == 0){
            return;
        }


        if(col<row){

            int max = getMax(arr, 0, lastindex);
            swap(arr, max, lastindex);
            selectionsort(arr, row, col+1, lastindex);
        }else {
            selectionsort(arr, row-1, 0, lastindex-row-1);
        }
    }


    static void swap(int[] arr, int one, int two){

        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    static int getMax(int[] arr, int s, int e){
        int max = s;
        for (int i=0; i<=e; i++){
            if (arr[i] > arr[max]){
                max = i;
            }
        }

        return max;
    }


    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionsort(arr, arr.length-1, 0, arr.length-1);
    }

}



