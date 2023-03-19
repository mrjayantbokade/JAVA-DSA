import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]  arr = new int[5] ;


//        System.out.println(arr[3]);

        for (int i=0; i < arr.length; i++){
            System.out.print("Enter num: ");
            arr[i] = input.nextInt();
        }



//        for (int i=0; i< arr.length; i++){
//            System.out.print(arr[i]+" ");
//
//        }

        //Enhanced for loop
        for(int num: arr){
            System.out.println(num);
        }

   }
}
