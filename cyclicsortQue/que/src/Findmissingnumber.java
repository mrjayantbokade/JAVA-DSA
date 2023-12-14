import java.util.Arrays;

public class Findmissingnumber {



    public static int  cs(int[] arr,int  n){

        int missing= 0;
        for (int i = 0; i < n; ) {

            int element = arr[i];
            if (i == element || element == n ){
                i++;
            }else {
                swap(arr, i, element);
            }
        }

        for (int i = 0; i < n; i++) {
            if (i != arr[i]){
                return i;
            }
        }
        return arr.length;
    }

    public static void swap(int[] arr, int one , int two){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }


    public static void main(String[] args) {
        int [] arrr = { 3, 0, 2, 1};
        System.out.println(cs(arrr, arrr.length));
        System.out.println(Arrays.toString(arrr));
    }
}