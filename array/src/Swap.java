import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {





        int[] arr = {1,2,3,4,5};
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();

        swap( arr,0,4);
    }

    /*This function is built for swapping the elements in the array on the basis of the
   index provided by the user in the function*/

    //

    public static void swap(int[] arr, int index1, int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;


//       int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;


        /*printing array
           using enhanced for loop*/

       for (int num: arr){
            System.out.print(num+" ");
        }

       //alternate method to print array

        System.out.println(Arrays.toString(arr));





   }
}
