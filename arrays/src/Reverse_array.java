public class Reverse_array {
    public static void main(String[] args){

        int arr[] = {1, 2, 3, 4, 5};


//        System.out.println(arr.length);
        int start = 0;
        int end = arr.length-1;
        for (int i=0; i<=arr.length/2; i++){

            reverse(arr, start, end);
            start++;
            end--;
        }


        for (int num: arr){
            System.out.print(num + " ");
        }




    }

    public static void reverse(int[] arr, int index1, int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
