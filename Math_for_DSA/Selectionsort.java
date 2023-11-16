public class Selectionsort {
    public static void main(String[] args) {


        int[] arr = {2,1, 3, 22, 11, 22, 33, 44, 22, 77};
        int size = arr.length;


        for (int i=0; i<size; i++){
            int s = i;
            for (int j=i+1; j<size; j++){
               if (arr[s]>arr[j]){
                   s = j;
                }
            }

            int temp = arr[s];
            arr[s] = arr[i];
            arr[i] = temp;
        }


        for (int num : arr){
            System.out.println(num+" ");
        }
    }
}
