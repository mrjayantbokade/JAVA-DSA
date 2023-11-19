public class Insertionsort {


    public static void main(String[] args) {
        int[] arr = {2,1, 3, 22, 11, 22, 33, 44, 22, 77};
        int size = arr.length;


       for (int i=1; i<size; i++){
           int key = arr[i];
           int j = i-1;

           while (j >= 0 && arr[j] > key){


                arr[j+1] = arr[j];
               j--;
           }
           arr[j+1] = key;
       }


        for (int num : arr){
            System.out.println(num+" ");
        }
    }
}
