package Sorting;

import java.util.Arrays;

public class MergeSort {


    public static int[] mergeSort(int arr[]){


        if (arr.length == 1){
            return arr;

        }

        int m = arr.length/ 2;


        int [] left = mergeSort(Arrays.copyOfRange(arr,0,m));


        int [] right = mergeSort(Arrays.copyOfRange(arr,m,arr.length));

        return mergeArrays(left,right);
    }

    public static int[] mergeArrays(int[] left, int [] right){


        int [] newMergedArray = new int[left.length + right.length];
        int i=0;
        int j=0;
        int k=0;

        while (i < left.length && j < right.length){

            if (left[i] < right[j]){
                newMergedArray[k] = left[i];
                i++;
                k++;

            }else {
                newMergedArray[k] = right[j];
                j++;
                k++;
            }

        }


        while ( i < left.length){
            newMergedArray[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length){
            newMergedArray[k] = right[j];
            j++;
            k++;
        }


        System.out.println(Arrays.toString(newMergedArray));
        return newMergedArray;


    }






    public static void main(String[] args) {

        int[] arr = {-21,33, 545324, 33 ,0, 3, 2, 1};

        mergeSort(arr);

    }
}
