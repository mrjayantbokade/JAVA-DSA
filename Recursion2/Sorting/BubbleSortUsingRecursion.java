package Sorting;

import java.util.Arrays;

public class BubbleSortUsingRecursion {




//    bhai bohot sochna pada
    public static void bubblysort(int[] arr, int i, int j){
        if(i == arr.length-1){
            for (int num : arr){
                System.out.print(num+", ");
            }
            System.out.println();

            return;

        }


        if (j <  arr.length){

            if (arr[j] < arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }


            bubblysort(arr, i, j+1);

        }else {




            bubblysort(arr, i+1, 1);
        }


    }


    public static void secondway(int[] arr, int row, int col){

        if(row == 0){
            return;
        }

        if (col < row ){



            if (arr[col] > arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            secondway(arr,row, col+1);


        }
        else{
            secondway(arr,row-1, 0);

        }
    }

    public static void main(String[] args) {
        int[] arr = {22, 21, 13, 7, 4, 3, 2, 1, 0};
        bubblysort(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
}
