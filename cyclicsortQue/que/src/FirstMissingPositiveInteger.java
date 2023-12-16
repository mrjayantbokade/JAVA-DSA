import java.util.Arrays;

public class FirstMissingPositiveInteger {
    public static int fun(int[] arr){


        int ans = -1;
        int i=0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] < 1){
                i++;
            }else {
            if (arr[i] <= arr.length  && arr[i] != arr[correct] ){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else {
                i++;
            }
            }
        }


        for (int j=0; j<arr.length; j++){

            if (arr[j] != j+1){
                return j+1;

            }
        }

        return ans;
//        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
//        int [] arr = {7, 8, 9, 11, 12};
        int [] arr = {3, 4, -1, 1};
//        int [] arr = {1, 2, 0};


        System.out.println(fun(arr));

    }
}
