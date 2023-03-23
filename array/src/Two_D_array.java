import java.util.Arrays;
import java.util.Scanner;

public class Two_D_array {
    public static void main(String[] args) {

        int arr[][] = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3}
        };



        //printing array way 1
//        for (int i = 0; i< arr.length; i++){
//            System.out.println(Arrays.toString(arr[i]));
//
//        }

        //printing array using enhanced for loop
        //for 2d arrays

//        for (int[] num: arr){
//            System.out.println(Arrays.toString(num));
//        }
//
//        for (int row=0; row<arr.length; row++){
//            for (int col=0; col < arr[row].length; col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }


        // printing the array with NO fixed no of columns
//        int arr2 [] [] = {
//                {1, 2, 3, 8},
//                {4, 5, 6},
//                {7, 8}
//        };
//
//        for (int row=0; row<arr2.length; row++){
//            for (int col=0; col < arr2[row].length; col++){
//                System.out.print(arr2[row][col]+" ");
//            }
//            System.out.println();
//        }
//
//
//        Scanner input = new Scanner(System.in);
//        int arr3 [] [] = new int[3][4];
//
//        for (int row=0; row<arr3.length; row++){
//            for (int col=0; col < arr3[row].length; col++){
//
//                 arr3[row][col] = input.nextInt();
//
//            }
//            System.out.println("hello");
//        }
//
//        for (int row=0; row<arr3.length; row++){
//            System.out.println(Arrays.toString(arr3[row]));
//        }


        // if you want to print particular element in a 2d array then

        int arr5[][] = {
                {1, 2, 3},{4, 5, 6},{7, 8, 9}
        };

        // for accessing particular element in a 2d array
        System.out.println(arr5[0][1]); // 2
    }
}
