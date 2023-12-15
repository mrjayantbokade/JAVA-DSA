import java.util.Arrays;

public class SetMIsmatch {

    public static int[] findMismatch(int[] arr){

        int[] ans = new int[2];
        int i=0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else {
                i++;
            }
        }

        for (int j=0;j<arr.length; j++){

            if (arr[j] != j+1){
                ans[0] = arr[j];
                ans[1] = j+1;
            }
        }

        return ans;
    }


    public static void main(String[] args) {
//        int [] arr = {4, 2, 2, 1};
        int [] arr = {1, 1};
        int ans[] = new int[2];
        ans = findMismatch(arr);
        System.out.println(Arrays.toString(ans));
    }
}
