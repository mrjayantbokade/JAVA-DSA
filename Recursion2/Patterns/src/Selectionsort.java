import javax.swing.plaf.PanelUI;
import java.util.Arrays;


public class Selectionsort {

    //selection sort is finding the largest element and placing into the last POSITION
    public static void usingloops(int[] arr){



        for (int i=0; i<arr.length; i++){
            int lastindex = arr.length-i-1;
            int max = getmax(arr, 0, lastindex);
            swap(arr,max, lastindex);
        }


    }


    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]  = temp;
    }
     static int getmax(int[] arr, int start, int end) {

        int max = start;
        for (int j=0; j<=end; j++){
            if (arr[j] > arr[max]){
                max = j;
            }
        }

        return max;
    }


    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};

        System.out.println(Arrays.toString(arr));

        usingloops(arr);
        System.out.println(Arrays.toString(arr));
    }
}
