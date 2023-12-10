public class BubbleSortUsingRecursion {




//    bhai bohot sochna pada
    public static void bubblysort(int[] arr, int i, int j){
        if(i == arr.length-1){
            for (int num : arr){
                System.out.print(num+", ");
            }
            System.out.println();

            return;

        }


        if (j <  arr.length-1){

            if (arr[j] < arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }


            bubblysort(arr, i, j+1);

        }else {

            if (arr[j] < arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
           

            bubblysort(arr, i+1, 1);
        }


    }


    public static void main(String[] args) {
        int[] arr = {22, 21, 13, 7, 4, 3, 2, 1, 0};
        bubblysort(arr,0,1);
    }
}
