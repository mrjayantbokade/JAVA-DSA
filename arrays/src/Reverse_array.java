public class Reverse_array {
    public static void main(String[] args){

        int arr[] = {1, 2, 3, 4, 5};


        for (int i =0; i < args.length-1; i++){


            int temp = arr[i];
            arr[i] = arr[arr.length-1];
            arr[arr.length-1 ] = temp;
        }

        for(int num:arr){
            System.out.println(num);
        }
    }
}
