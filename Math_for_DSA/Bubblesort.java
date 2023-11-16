public class Bubblesort {
    public static void main(String[] args) {




        int[] arr = {2,1, 3, 22, 11, 22, 33, 44, 22, 77};
        int size = arr.length;

        for (int i=0; i<size; i++){
            for (int j=i+1; j<size-i; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }



        for (int num : arr){
            System.out.println(num+" ");
        }
    }
}
