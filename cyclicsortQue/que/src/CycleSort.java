import java.util.Arrays;

public class CycleSort {


    public static void cs(int[] arr) {

        for (int i = 0; i < arr.length; ) {

            int element = arr[i];
            if (i == element - 1) {
                i++;
            } else {
                swap(arr, i, element - 1);
            }
        }
    }

    public static void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    public static void main(String[] args) {
        int [] arr = { 5, 3, 2, 4,1};
        cs(arr);
        System.out.println(Arrays.toString(arr));
    }
}