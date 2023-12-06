package pack;
import java.util.Scanner;
public class Sirskacode {
    public static int  binarys(int[]arr, int target, int start, int end){

                int mid = (start + end)/2;
                if (start == end) {
                    return arr[start];
                } else if (target< arr[mid]) {
                    return binarys(arr, target, start, mid - 1);
                } else {
                    return binarys(arr, target, mid + 1, end);
                }


        }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the array elements:");
        for (int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the target element:");
        int target = in.nextInt();

        int ans = binarys(arr, target, 0, arr.length-1);

        if (ans == target){
            System.out.println("Element  found"+ans);
        }else {
            System.out.println("Element not found at index ");
        }
    }
}
