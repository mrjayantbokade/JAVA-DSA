package Sorting;

import java.util.Arrays;

public class Check {


    public static void main(String[] args) {


        int arr[] = {1, 2, 3, -44, -99, 0, 3, 3, 2, 3,1, 4444, 333, 223,23, 33};
        System.out.println(Arrays.toString(arr));

        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergesort(int[] arr){

        if (arr.length == 1){
            return arr;
        }

        int m = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, m));
        int[] right = mergesort(Arrays.copyOfRange(arr, m, arr.length));

        return merge(left,right);
    }


    public static int[] merge(int[] left, int[] right){

        int[] mergedArray = new int[left.length + right.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<left.length && j<right.length){
            if (left[i] < right[j]){
                mergedArray[k] = left[i];
                i++;
                k++;
            }
            else {
                mergedArray[k] = left[j];
                j++;
                k++;
            }



            while (i < left.length){
                mergedArray[k] = left[i];
                i++;
                k++;
            }

            while (j < right.length){
                mergedArray[k] = right[j];
                j++;
                k++;
            }
        }




        return mergedArray;
    }
}
